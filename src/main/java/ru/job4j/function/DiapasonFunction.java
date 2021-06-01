package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiapasonFunction {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        while (start < end) {
            list.add(func.apply((double) start++));
        }
        return list;
    }
}
