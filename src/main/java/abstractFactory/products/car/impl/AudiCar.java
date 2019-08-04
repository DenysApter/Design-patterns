package abstractFactory.products.car.impl;

import abstractFactory.products.car.ICar;
import lombok.ToString;


@ToString
public class AudiCar implements ICar {
    private final String brand = "audi";

    @Override
    public void info() {
        System.out.println(this);
    }
}
