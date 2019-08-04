package chainofresponsibility.handlers;

public class DoubleHandler implements IHandler {

    private IntegerHandler integerHandler = new IntegerHandler();

    @Override
    public void handle(Object o) {
        System.out.println("DoubleHandler");
        if (o instanceof Double) {
            System.out.println("this is double!");
            return;
        } else {
            integerHandler.handle(o);
        }
    }
}
