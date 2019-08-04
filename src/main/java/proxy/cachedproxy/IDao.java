package proxy.cachedproxy;

public interface IDao {
    String read(double request) throws InterruptedException;
}
