package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(i -> System.out.println("Max: " + i));

    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        } else {
            int max = data[0];
            for (int datum : data) {
                if (max < datum) {
                    max = datum;
                }

            }
            return Optional.of(max);
        }
    }
}
