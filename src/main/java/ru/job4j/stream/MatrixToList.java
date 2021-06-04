package ru.job4j.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    public static List<Integer> toList(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}

