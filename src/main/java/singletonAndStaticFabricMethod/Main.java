package singletonAndStaticFabricMethod;

public class Main {
    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();
        SingletonClass instance3 = SingletonClass.getInstance();
        SingletonClass instance4 = SingletonClass.getInstance();

        if (instance1 == instance2 && instance2 == instance3 && instance3 == instance4) {
            System.out.println("this is one object");
        }
    }
}
