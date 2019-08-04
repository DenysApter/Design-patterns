package templateMethod.buildings;

public class SimpleBuilding extends BaseBuilding {
    @Override
    protected void makeGarage() {
        System.out.println("Without Garage");
    }

    @Override
    protected void makeGym() {
        System.out.println("Without Gym");
    }

    @Override
    protected void makePool() {
        System.out.println("Without Pool");
    }
}
