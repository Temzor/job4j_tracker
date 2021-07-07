package ru.training.codewars;

import java.util.stream.IntStream;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a)
                .filter(i -> IntStream.of(b).noneMatch(y -> i == y)).toArray();
    }

}