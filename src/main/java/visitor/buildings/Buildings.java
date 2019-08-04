package visitor.buildings;

import visitor.visitors.Visitor;

public interface Buildings {

    void accept(Visitor visitor);

    String getName();
}
