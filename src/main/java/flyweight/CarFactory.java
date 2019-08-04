package flyweight;

import java.util.HashMap;
import java.util.Map;


public class CarFactory {

    static Map<Integer, CarType> treeTypes = new HashMap<>();

    public static CarType getCarType(int countDoors, int countWheels) {
        CarType result = treeTypes.get(countDoors);
        if (result == null) {
            result = new CarType(countDoors, countWheels);
            treeTypes.put(countDoors, result);
        }
        return result;
    }
}
