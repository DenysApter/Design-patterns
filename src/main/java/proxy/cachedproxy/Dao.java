package proxy.cachedproxy;

public class Dao implements IDao  {

    Db db = new Db();

    @Override
    public String read(double request) throws InterruptedException {
        return db.get(request);
    }
}
