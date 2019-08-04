package prototype;

import lombok.ToString;

@ToString
 class Car implements Cloneable {
    public String color;

    Car(String color) {
        this.color = color;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
