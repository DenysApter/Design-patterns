package composite.order;

public class Order implements IOrder {

    int cost;

    public Order(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
