package bridge.drivers;

import bridge.car.ICar;

public class Racer implements IDrivers {

    ICar car;

    public Racer(ICar car) {
        this.car = car;
    }

    @Override
    public void driveCar() {
        car.sportModeDisable();
        car.drive();
    }

    public void race() {
        car.sportModeEnable();
        car.drive();
    }
}
