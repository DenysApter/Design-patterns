package composite;


import composite.order.BoxOfOrders;
import composite.order.IOrder;
import composite.order.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(20);
        Order order2 = new Order(20);
        Order order3 = new Order(20);
        Order order4 = new Order(20);
        Order order5 = new Order(20);

        BoxOfOrders boxOut = new BoxOfOrders();
        BoxOfOrders boxInner = new BoxOfOrders();

        ArrayList<IOrder> arrOut = new  ArrayList<>();
        ArrayList<IOrder> arrInner = new  ArrayList<>();

        arrInner.add(order1);
        arrInner.add(order2);
        boxInner.fillBox(arrInner);
        arrOut.add(order3);
        arrOut.add(boxInner);
        arrOut.add(order4);
        arrOut.add(order5);
        boxOut.fillBox(arrOut);

        System.out.println( boxOut.getCost());
    }
}

