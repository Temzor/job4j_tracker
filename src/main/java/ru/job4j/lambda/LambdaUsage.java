package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import  ru.job4j.lambda.FI;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return left.compareTo(right);
        };

        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(right.length(), left.length());
        };

        String[] capitalCities = {
                "Kiev",
                "Moscow",
                "Damascus"
        };

        Arrays.sort(capitalCities, cmpText);
        Arrays.sort(capitalCities, cmpDescSize);
    }
}