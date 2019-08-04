package builder;

import lombok.ToString;

@ToString
public class Car {
    String color;
    String maxSpeed;
    String countDoors;

   private Car(String color, String maxSpeed, String countDoors) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.countDoors = countDoors;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String color;
        private String maxSpeed;
        private String countDoors;

        CarBuilder() {
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder maxSpeed(String maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder countDoors(String countDoors) {
            this.countDoors = countDoors;
            return this;
        }

        public Car build() {
            return new Car(this.color, this.maxSpeed, this.countDoors);
        }

        public String toString() {
            return "prototype.CarBuilder(color=" + this.color + ", maxSpeed=" + this.maxSpeed + ", countDoors=" + this.countDoors + ")";
        }
    }
}
