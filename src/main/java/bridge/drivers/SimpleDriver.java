package bridge.drivers;


import bridge.car.ICar;

public class SimpleDriver implements IDrivers {

    ICar car;

    public SimpleDriver(ICar car) {
        this.car = car;
        car.sportModeDisable();
    }

    @Override
    public void driveCar() {
        car.drive();
    }
}
