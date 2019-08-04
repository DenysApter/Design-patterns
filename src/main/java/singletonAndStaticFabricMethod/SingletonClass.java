package singletonAndStaticFabricMethod;

public class SingletonClass {

    static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
