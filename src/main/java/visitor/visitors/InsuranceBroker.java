package visitor.visitors;


import visitor.buildings.Buildings;
import visitor.buildings.House;
import visitor.buildings.Office;

public class InsuranceBroker implements Visitor {

    public void visit(Buildings building) {
        building.accept(this);
    }

    @Override
    public void visitInHouse(House building) {
        System.out.println("offer life insurance in " + building.getName());
    }

    @Override
    public void visitInOffice(Office building) {
        System.out.println("offer building insurance in " + building.getName());
    }
}
