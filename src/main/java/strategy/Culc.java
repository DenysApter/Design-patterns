package strategy;

import java.util.function.BinaryOperator;

public class Culc {

    public void calculate(BinaryOperator<Integer> binaryOperator, int a, int b) {
        Integer res = binaryOperator.apply(a, b);
        System.out.println(res);
    }
}
