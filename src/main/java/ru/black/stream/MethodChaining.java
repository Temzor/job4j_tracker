package ru.black.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodChaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array)
                .filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e /= 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e)
                .getAsInt();

        System.out.println(result);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

        integerStream
                .filter(element -> {
                    System.out.println("!!!");
                    return element % 2 == 0;
                })
                .collect(Collectors.toList());
    }

}
