package flyweight;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 100).forEach(i -> new Car("black", 40, 4, 4));
        System.out.println(CarFactory.treeTypes.size());
    }
}
