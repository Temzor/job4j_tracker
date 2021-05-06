package ru.job4j.oop;

public class Max {

    public static int max(int fist, int second) {
        return Math.max(fist, second);
    }

    public static int max(int fist, int second, int third) {
        return max(fist, max(second, third));
    }

    public static int max(int fist, int second, int third, int fourth) {
        return max(fist, max(second, third, fourth));
    }
}

