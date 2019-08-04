package flyweight;

public class Car {

    String color;
    int maxSpeed;
    CarType carType;

    public Car(String color, int maxSpeed, int doors, int countWheels) {
       CarType res =  CarFactory.getCarType(doors, countWheels);
       this.color = color;
       this.maxSpeed = maxSpeed;
       this.carType = res;
    }
}
