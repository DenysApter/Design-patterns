package builder;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder().color("green").build();
        System.out.println(car);
    }
}
