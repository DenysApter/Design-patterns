package abstractFactory.brands.impl;

import abstractFactory.brands.IProducts;
import abstractFactory.products.bike.BikeFactory;
import abstractFactory.products.bike.IBike;
import abstractFactory.products.car.CarFactory;
import abstractFactory.products.car.ICar;


public class AudiProducts implements IProducts {

    @Override
    public ICar createCar() {
       return CarFactory.createCar("audi");
    }



    @Override
    public IBike createBike() {
        return BikeFactory.createBike("audi");
    }
}
