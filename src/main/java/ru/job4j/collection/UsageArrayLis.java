package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayLis {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add(0,"Petr");
        names.add(1,"Ivan");
        names.add(2,"Stepan");

        for (Object value : names) {
            System.out.println(value);
        }
    }
}
