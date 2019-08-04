package bridge;


import bridge.car.Bugatti;
import bridge.drivers.Racer;
import bridge.drivers.SimpleDriver;


public class Main {
    public static void main(String[] args) {

        Bugatti car = new Bugatti();

        Racer racer = new Racer(car);
        racer.driveCar();
        racer.race();

        SimpleDriver driver = new SimpleDriver(car);
        driver.driveCar();
    }


}
