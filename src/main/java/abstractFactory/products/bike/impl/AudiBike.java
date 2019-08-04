package abstractFactory.products.bike.impl;

import abstractFactory.products.bike.IBike;
import lombok.ToString;



@ToString
public class AudiBike implements IBike {
    private final String brand = "audi";

    @Override
    public void info() {
        System.out.println(this);
    }
}
