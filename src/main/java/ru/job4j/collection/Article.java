package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String clearOrigin = origin.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "");
        Set<String> setOrigin = new HashSet<>(Arrays.asList(clearOrigin.split(" ")));
        Set<String> setLine = new HashSet<>(Arrays.asList(line.split(" ")));

        return setOrigin.containsAll(setLine);
    }
}
