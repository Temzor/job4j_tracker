package ru.training.codewars;

import java.util.Locale;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word) {
        return word
                .toLowerCase()
                .chars()
                .mapToObj(x -> String.valueOf((char) x))
                .map(x -> word
                        .toLowerCase()
                        .indexOf(x)
                        == word
                        .toLowerCase()
                        .lastIndexOf(x) ? "(" : ")")
                .collect(Collectors.joining());
    }
}