package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String clearOrigin = origin.replaceAll("\\p{P}", "");
        Set<String> setOrigin = new HashSet<>(Arrays.asList(clearOrigin.split(" ")));
        for (String s : line.split(" ")) {
            if (!setOrigin.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
