package abstractFactory;


import abstractFactory.brands.IProducts;
import abstractFactory.products.bike.IBike;
import abstractFactory.products.car.ICar;


public class Main {
    public static void main(String[] args) {
        IProducts factory = AbstractFactory.createFactory("audi");

        //=====BIKE======================
        IBike bike =  factory.createBike();
        System.out.println(bike);
        //=====CAR=======================
        ICar car = factory.createCar();
        System.out.println(car);
    }
}
