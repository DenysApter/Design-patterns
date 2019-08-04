package objectpool;


public class PooledObjects implements Runnable {

    private Thread t;
    private ObjectPool objectPool;


  public PooledObjects(ObjectPool objectPool) {
    this.objectPool = objectPool;
  }

  public void setTask(Thread t) {
      this.t = t;
  }

    @Override
    public void run() {
        t.run();
        objectPool.released(this);
    }
}
