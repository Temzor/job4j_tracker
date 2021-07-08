package ru.training.codewars;

import java.util.Arrays;

public class Solution1 {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int sum = Arrays.stream(customers)
                .sum();
        return sum / n;
    }
}