package ru.job4j.list;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        if (!list.contains(el)) {
            return list.subList(list.indexOf(el), list.lastIndexOf(el));
        } else if (list.indexOf(el) == list.lastIndexOf(el)) {
            return list.subList(list.indexOf(el), list.lastIndexOf(el));
        } else {
            return list.subList(list.indexOf(el), list.lastIndexOf(el));
        }
    }
}