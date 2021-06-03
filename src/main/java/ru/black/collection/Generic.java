package ru.black.collection;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("OK");
        list.add("Hi!");
        list.add("By!");
        list.add("How are you?");

        for (String o : list) {
            System.out.println(o + " dlina: " + o.length());
        }
    }
}
