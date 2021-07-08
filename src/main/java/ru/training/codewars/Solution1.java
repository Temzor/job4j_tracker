package ru.training.codewars;

import java.util.Arrays;

public class Solution1 {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int sum = 0;
        for (int customer : customers) {
            sum += customer;

        }
        return sum / n;
    }
}