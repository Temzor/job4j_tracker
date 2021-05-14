package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(s.split("")));
        return stringSet.size() == s.length();
    }
}