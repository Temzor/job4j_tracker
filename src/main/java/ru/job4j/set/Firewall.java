package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] str = s.split(" ");
        for (String value : str) {
            if (words.contains(value)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}