package objectpool;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ObjectPool ex = new ObjectPool(10, 3);

        IntStream.range(0, 200).forEach(i -> ex.execute(new Thread(()-> System.out.println(i))));
        Thread.sleep(6000);

        IntStream.range(200, 300).forEach(i -> ex.execute(new Thread(()-> System.out.println(i))));

        Thread.sleep(6000);
        System.out.println("POOL SIZE =====>  " + ex.checkPoolSize());
    }
}
