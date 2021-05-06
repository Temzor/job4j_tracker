package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftSplit = left.split(". ");
        String[] rightSplit = right.split(". ");
        return Integer.compare(Integer.parseInt(leftSplit[0]), Integer.parseInt(rightSplit[0]));
    }
}