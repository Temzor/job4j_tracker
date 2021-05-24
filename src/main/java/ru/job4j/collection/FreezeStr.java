package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }

        char[] charLeft = left.toCharArray();
        char[] charRight = right.toCharArray();

        Arrays.sort(charLeft);
        Arrays.sort(charRight);

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < charLeft.length; i++) {
            map1.put(charLeft[i], i);
            map2.put(charRight[i], i);

        }
        return map1.equals(map2);

    }
}