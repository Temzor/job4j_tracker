package ru.job4j.lambda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        return strings.equals(value) ? Optional.of(value) : Optional.ofNullable(value);

    }
}
