package ru.black.stream;

import java.util.stream.Stream;

public class MethodConcat {
    public static void main(String[] args) {
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> integerStream3 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> integerStream4 = Stream.concat(integerStream2, integerStream3);

        integerStream4
                .forEach(System.out::println);
    }
}
