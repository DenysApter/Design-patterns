package abstractFactory.products.bike;

import abstractFactory.products.bike.impl.AudiBike;
import abstractFactory.products.bike.impl.MercedesBike;

public class BikeFactory {

    public static IBike createBike(String brand) {
        IBike res = null;
        switch (brand) {
            case "audi": {
                res = new AudiBike();
                break;
            }
            case  "mercedes": {
                res = new MercedesBike();
                break;
            }
        }
        return res;
    }
}
