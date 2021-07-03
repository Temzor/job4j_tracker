package ru.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckEvenAndPositive {

    public static boolean check(int num) {
         return check(p -> p > 0 && p % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
