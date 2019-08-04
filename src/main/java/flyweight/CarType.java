package flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CarType {
    int countDoors;
    int countWheels;
}
