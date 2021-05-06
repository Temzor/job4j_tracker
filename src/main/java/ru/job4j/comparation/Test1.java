package ru.job4j.comparation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Tatyana");
        list.add("Dmitrii");
        System.out.println("Перед сортировкой: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировкой: ");
        System.out.println(list);

    }
}
