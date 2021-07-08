package ru.training.codewars;

public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return result.toString();
    }
}