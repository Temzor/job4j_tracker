package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = right.split("/", 2)[0].compareTo(left.split("/", 2)[0]);
        return (result == 0) ? left.compareTo(right) : result;
    }
}