package templateMethod.buildings;

public class CustomBuilding extends BaseBuilding {

    @Override
    public void build() {
        super.build();
        makeHook();
    }

    @Override
    protected void makeGarage() {
        System.out.println("With Garage");
    }

    @Override
    protected void makeGym() {
        System.out.println("With Gym");
    }

    @Override
    protected void makePool() {
        System.out.println("With Pool");
    }

    protected void makeHook() {
        System.out.println("With golf course");
    }
}
