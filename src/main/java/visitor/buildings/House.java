package visitor.buildings;


import visitor.visitors.Visitor;

public class House implements Buildings {

    private String name = "house";


    @Override
    public void accept(Visitor visitor) {
        visitor.visitInHouse(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
