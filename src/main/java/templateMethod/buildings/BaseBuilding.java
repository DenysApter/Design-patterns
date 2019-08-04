package templateMethod.buildings;

public abstract class BaseBuilding {

    public void build() {
        makeRoof();
        makeWalls();
        makeFloor();
        makeGarage();
        makeGym();
        makePool();
    }

    protected void makeRoof() {
        System.out.println("roof");
    }

    protected void makeWalls() {
        System.out.println("walls");
    }

    protected void makeFloor() {
        System.out.println("floor");
    }

    protected abstract void makeGarage();

    protected abstract void makeGym();

    protected abstract void makePool();
}
