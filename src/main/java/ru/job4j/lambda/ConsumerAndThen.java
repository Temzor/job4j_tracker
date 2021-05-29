package ru.job4j.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
         Consumer<String> print = (p -> System.out.print(p));
         Consumer<String> ln = (p -> System.out.println());
         return print.andThen(ln);
    }
}
