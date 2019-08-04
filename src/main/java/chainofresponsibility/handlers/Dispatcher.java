package chainofresponsibility.handlers;

public class Dispatcher {

    private IntegerHandler integerHandler = new IntegerHandler();

    private StringHandler stringHandler = new StringHandler();

    private DoubleHandler doubleHandler = new DoubleHandler();



   public void getRequest(Object o) {
       if (o instanceof String) {
           stringHandler.handle(o);
           return;
       }
      else if (o instanceof Double) {
           doubleHandler.handle(o);
           return;
       }
      else if (o instanceof Integer) {
          integerHandler.handle(o);
          return;
       }
       doubleHandler.handle(o);
   }
}
