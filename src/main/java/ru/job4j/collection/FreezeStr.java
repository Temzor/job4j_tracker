package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }

        char[] charLeft = left.toCharArray();
        char[] charRight = right.toCharArray();

        Map<Character, Integer> leftMap = new HashMap<>();
        for (Character character : charLeft) {
            Integer value = leftMap.get(character);
            leftMap.put(character, value == null ? 1 : ++value);
        }

        for (char c : charRight) {
            if (!leftMap.containsKey(c)) {
                return false;
            } else if (leftMap.containsKey(c) && leftMap.get(c) == 1) {
                leftMap.remove(c);
            } else if (leftMap.containsKey(c) && leftMap.get(c) > 1) {
                leftMap.put(c, leftMap.get(c) - 1);
            }

        }
        return true;
    }
}