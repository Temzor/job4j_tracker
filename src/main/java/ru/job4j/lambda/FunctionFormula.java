package ru.job4j.lambda;

import java.util.function.Function;

public class FunctionFormula {

    public static double calculate(double x) {
         return calculate(c -> c * c + 2 * c + 1, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}
