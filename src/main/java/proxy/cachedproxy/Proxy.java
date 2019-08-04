package proxy.cachedproxy;


import java.util.HashMap;
import java.util.Map;

public class Proxy implements IDao {

    Dao dao;

    Map<Double, String> cache = new HashMap<>();

    public Proxy(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String read(double request) throws InterruptedException {
        if (cache.get(request) == null) {
           String res = dao.read(request);
           cache.put(request,res);
           return res;
        }
        return cache.get(request);
    }
}
