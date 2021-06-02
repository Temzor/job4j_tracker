package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(-2);
        integerList.add(-1);
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);

        List<Integer> list = integerList.stream()
                .filter(element -> element > 0)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
