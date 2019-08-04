package visitor.visitors;

import visitor.buildings.House;
import visitor.buildings.Office;

public interface Visitor {
    void visitInHouse(House building);
    void visitInOffice(Office building);
}
