package ru.training.codewars;

import java.util.stream.IntStream;

public class FindOdd {
    public static int findIt(int[] a) {
        return IntStream.of(a)
                .reduce(0, (x, y) -> x ^ y);
    }
}
