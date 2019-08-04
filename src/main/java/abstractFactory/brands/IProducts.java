package abstractFactory.brands;

import abstractFactory.products.bike.IBike;
import abstractFactory.products.car.ICar;

public interface IProducts {
    ICar createCar();
    IBike createBike();
}
