package prototype;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Car car = new Car("black");
        Prototype prot =  new Prototype();
        prot.name = "prot111";
        prot.car = car;

        Prototype prot2 = prot.clone();
        prot2.car.color = "green";

        System.out.println(prot);
        System.out.println(prot2);
    }
}
