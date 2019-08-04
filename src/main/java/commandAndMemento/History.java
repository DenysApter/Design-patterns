package commandAndMemento;



import java.util.Stack;

public class History {

    private  Building building;

    private  Stack<Building.CopyBuilding> history = new Stack<>();

    History(Building building) {
        this.building = building;
    }

    public  void doSomething(ICommand command) {
        addHistory();
        command.execute(building);
    }

    public  void addHistory() {
        history.add(building.getCopy());
    }

    public  void undo() {
        building.restore(history.pop());
    }
}
