package commandAndMemento;


public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        History history = new History(building);

        ICommand addBrick = (b) -> b.addMaterial("Brick");
        ICommand addSlate = (b) -> b.addMaterial("Slate");

        history.doSomething(addBrick);
        building.countBricks();

        history.undo();
        building.countBricks();

        history.doSomething(addBrick);
        history.doSomething(addSlate);
        building.countBricks();

        history.undo();
        building.countBricks();

        history.undo();
        building.countBricks();
    }
}
