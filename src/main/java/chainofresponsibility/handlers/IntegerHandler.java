package chainofresponsibility.handlers;

public class IntegerHandler implements IHandler {

    private StringHandler stringHandler = new StringHandler();

    @Override
    public void handle(Object o) {
        System.out.println("IntegerHandler");
        if (o instanceof Integer) {
            System.out.println("this is integer!");
            return;
        } else {
            stringHandler.handle(o);
        }
    }
}
