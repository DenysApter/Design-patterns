package chainofresponsibility;

import chainofresponsibility.handlers.Dispatcher;

public class Main {
    public static void main(String[] args) {
     String str = "string";
     int numb = 2;
     double d = 2.2;
     boolean bool = true;


        Dispatcher dispatcher = new Dispatcher();

        System.out.println("==========STRING=======");
        dispatcher.getRequest(str);
        System.out.println("===========DOUBLE===========");
        dispatcher.getRequest(d);
        System.out.println("===========Integer===========");
        dispatcher.getRequest(numb);
        System.out.println("===========BOOLEAN===========");
        dispatcher.getRequest(bool);
    }
}
