package proxy.cachedproxy;

public class Db {

    public String get(double request) throws InterruptedException {
        Thread.sleep(3000);
        return request + "";
    }
}
