package strategy;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        BinaryOperator<Integer> plus = (a, b) -> a + b;

        Culc culc = new Culc();
        culc.calculate(multiply, 2,4);
        culc.calculate(plus, 2,4);
    }
}
