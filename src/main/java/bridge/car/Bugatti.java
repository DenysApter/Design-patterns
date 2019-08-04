package bridge.car;

public class Bugatti implements ICar {

    private boolean sportMode = false;

    @Override
    public void drive() {
        System.out.printf("drive in %s%n", sportMode ? "sport mode" : "normal mode");
    }

    @Override
    public void sportModeEnable() {
        sportMode = true;
    }

    @Override
    public void sportModeDisable() {
        sportMode = false;
    }
}

