package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        /*
          Comparing the length of two lines, for the zone of use of the code below
         */
        if (left.length() != right.length()) {
            return false;
        }

        /*
         * Split words into an array of letters
         */
        char[] charLeft = left.toCharArray();
        char[] charRight = right.toCharArray();

        /*
         * Sort letters with natural order
         */
        Arrays.sort(charLeft);
        Arrays.sort(charRight);

        /*
         * Create HashMap with <K, V> =  <String, Integer>, String = char letter,
         * Integer = count(negligible)
         */

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        /*
         * Filling in the Map
         */
        for (int i = 0; i < charLeft.length; i++) {
            map1.put(charLeft[i], i);
            map2.put(charRight[i], i);

        }
        return map1.equals(map2);

    }
}