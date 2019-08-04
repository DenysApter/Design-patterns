package abstractFactory.products.car;


import abstractFactory.products.car.impl.AudiCar;
import abstractFactory.products.car.impl.MercedesCar;

public class CarFactory {

    public static ICar createCar(String brand) {
        ICar res = null;
        switch (brand) {
            case "audi": {
                res = new AudiCar();
                break;
            }
            case  "mercedes": {
                res = new MercedesCar();
                break;
            }
        }
        return res;
    }
}
