package abstractFactory.products.car.impl;

import abstractFactory.products.car.ICar;
import lombok.ToString;


@ToString
public class MercedesCar implements ICar {
    private final String brand = "mercedes";

    @Override
    public void info() {
        System.out.println(this);
    }
}
