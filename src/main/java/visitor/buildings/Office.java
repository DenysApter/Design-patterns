package visitor.buildings;

import visitor.visitors.Visitor;

public class Office implements Buildings {


    private String name = "office";

    @Override
    public void accept(Visitor visitor) {
        visitor.visitInOffice(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
