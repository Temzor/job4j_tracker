package ru.job4j.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
         Consumer<String> print = n -> System.out.print(input);
         Consumer<String> ln = n -> System.out.println();
         return print.andThen(ln);
    }
}
