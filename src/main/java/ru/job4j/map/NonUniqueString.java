package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            map.computeIfPresent(s, (key, value) -> true);
            map.putIfAbsent(s, false);

        }

        return map;
    }
}