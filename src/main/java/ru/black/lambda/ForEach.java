package ru.black.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "good", "by-by");
        for (String s : list) {
            System.out.println(s);
            
        }
        list.forEach(System.out::println);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        integerList.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });
    }
}
