package prototype;

import lombok.ToString;


@ToString
public class Prototype implements Cloneable {
    public String name;
    public Car car;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype pr = (Prototype) super.clone();
        Car cloneCar = car.clone();
        pr.car = cloneCar;
        return pr;
    }
}