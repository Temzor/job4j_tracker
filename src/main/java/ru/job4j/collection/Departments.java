package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> temp = new LinkedHashSet<>();
        for (String s : deps) {
            String start;
        }
        for (String value : deps) {
            StringBuilder start = new StringBuilder();
            for (String el : value.split("/")) {
               temp.add(start + el);
               start.append(el).append("/");
            }
        }
        return new ArrayList<>(temp);
    }

    public static void sortAsc(List<String> args) {
        Collections.sort(args);
    }

    public static void sortDesc(List<String> args) {
        args.sort(new DepDescComp());
    }
}
