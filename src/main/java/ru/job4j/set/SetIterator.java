package ru.job4j.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetIterator {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one", "two", "three", "four", "five"));
        for (String string : strings) {
            System.out.printf("Next element exist? - %s.%n", true);
            System.out.println(string);
        }
    }
}