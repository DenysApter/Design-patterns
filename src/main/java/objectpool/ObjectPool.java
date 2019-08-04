package objectpool;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.IntStream;

public class ObjectPool {

    private List<PooledObjects> pool = new LinkedList<>();

    private BlockingDeque<Thread> tasks = new LinkedBlockingDeque<>();

    private int maxSize;

    private int minSize;

    private int countCreatedObject;

    private int countTasks;

    public ObjectPool() {
        this.maxSize = 0;
        this.minSize = Integer.MAX_VALUE;
        IntStream.range(0, minSize).forEach(i -> pool.add(new PooledObjects(this)));
        countCreatedObject = minSize;
        new Thread(() -> waitTasks()).start();
    }

    public ObjectPool(int maxSize) {
        this.maxSize = maxSize;
        this.minSize = Integer.MAX_VALUE;
        IntStream.range(0, minSize).forEach(i -> pool.add(new PooledObjects(this)));
        countCreatedObject = minSize;
        new Thread(() -> waitTasks()).start();
    }


    public ObjectPool(int maxSize, int minSize) {
        this.maxSize = maxSize;
        this.minSize = minSize;
        IntStream.range(0, minSize).forEach(i -> pool.add(new PooledObjects(this)));
        countCreatedObject = minSize;
        new Thread(() -> waitTasks()).start();
    }

    private void waitTasks() {
        Thread t = null;
        try {
            t = tasks.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        makeTask(t);
    }

    public void execute(Thread t)  {
        try {
            tasks.put(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeTask(Thread t) {
        while (pool.isEmpty() && countCreatedObject >= maxSize) {
            Thread.yield();
        }
        tasks.remove(0);
        if (pool.isEmpty()) {
            PooledObjects obj = new PooledObjects(this);
            obj.setTask(t);
            obj.run();
            countCreatedObject = countCreatedObject + 1;
        } else {
            PooledObjects obj = pool.get(0);
            pool.remove(0);
            obj.setTask(t);
            obj.run();
        }
        countTasks += countTasks;
    }

    public void released(PooledObjects obj)  {
        countTasks -= countTasks;
        if (pool.size() < minSize)
            pool.add(obj);
        waitTasks();
    }

    public int checkPoolSize() {
        return pool.size();
    }
}
