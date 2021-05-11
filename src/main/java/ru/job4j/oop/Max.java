package ru.job4j.oop;
/**
 * Класс описывает принципы ООП
 * @author Dnitrii Kapustin
 * @version 1.0
 */

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

