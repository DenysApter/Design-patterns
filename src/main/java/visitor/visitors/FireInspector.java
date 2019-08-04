package visitor.visitors;

import visitor.buildings.Buildings;
import visitor.buildings.House;
import visitor.buildings.Office;

public class FireInspector implements Visitor {

    public void visit(Buildings building) {
        building.accept(this);
    }

    @Override
    public void visitInHouse(House building) {
        System.out.println("check sockets in " + building.getName());
    }

    @Override
    public void visitInOffice(Office building) {
        System.out.println("check sockets in " + building.getName());
    }
}
