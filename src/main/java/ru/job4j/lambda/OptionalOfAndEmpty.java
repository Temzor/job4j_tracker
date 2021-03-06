package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        if (strings.contains(value)) {
            return Optional.of(value);
        } else {
            return Optional.empty();
        }

    }
}