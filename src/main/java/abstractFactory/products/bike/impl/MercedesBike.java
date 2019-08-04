package abstractFactory.products.bike.impl;

import abstractFactory.products.bike.IBike;
import lombok.ToString;

@ToString
public class MercedesBike implements IBike {
    private final String brand = "mercedes";

    @Override
    public void info() {
        System.out.println(this);
    }
}
