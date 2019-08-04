package proxy;

import proxy.cachedproxy.Dao;
import proxy.cachedproxy.Proxy;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Dao dao = new Dao();
        Proxy proxy = new Proxy(dao);

        IntStream.range(0, 200).forEach(i -> {
            try {
                System.out.println(proxy.read( ((int)(Math.random()*3))));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
