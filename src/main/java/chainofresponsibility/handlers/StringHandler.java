package chainofresponsibility.handlers;

public class StringHandler implements IHandler {

    @Override
    public void handle(Object o) {
        System.out.println("StringHandler");
        System.out.println(o.toString());
    }
}
