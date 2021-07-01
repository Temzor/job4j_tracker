package ru.black.stream;

import java.util.*;
import java.util.stream.Collectors;

public class MethodMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi!");
        list.add("How are you?");
        list.add("OK!");
        list.add("Bay!");

        List<Integer> listInt = list
                .stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(listInt);

        int[] array = {5, 9, 3, 8, 1};
        System.out.println(Arrays.toString(array));
        array = Arrays
                .stream(array)
                .map(element
        -> {
            if (element % 3 == 0) {
            element /= 3;
        }
        return element;
        }).toArray();

        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hi!");
        set.add("How are you?");
        set.add("Good!");
        set.add("By");

        System.out.println(set);

        Set<Integer> setInt = set
                .stream()
                .map(String::length)
                .collect(Collectors.toSet());
        System.out.println(setInt);

    }
}
