package composite.order;

import java.util.ArrayList;

public class BoxOfOrders implements IOrder {

    ArrayList<IOrder> arr = new ArrayList<>();

    public void fillBox(ArrayList<IOrder> orders) {
        orders.forEach(o -> arr.add(o));
    }

    @Override
    public int getCost() {
        return  arr.stream()
                .mapToInt(o -> o.getCost())
                .sum();
    }
}
