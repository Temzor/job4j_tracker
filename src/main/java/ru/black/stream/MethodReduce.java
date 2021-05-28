package ru.black.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);
        System.out.println("-----------------------------------------");

        int result2 = list.stream().reduce(1, (accumulator, element) ->
                accumulator * element);
        System.out.println(result2);
        System.out.println("-----------------------------------------");

        List<String> stringList = new ArrayList<>();
        stringList.add("Hi!");
        stringList.add("How are you?");
        stringList.add("OK!");
        stringList.add("By!");

        String result3 = stringList.stream().reduce((accumulator, element) ->
                accumulator + " " +  element).get();
        System.out.println(result3);
        System.out.println("-----------------------------------------");

        Optional<Integer> o = list.stream().reduce((accumulator, element) ->
                accumulator * element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("Not present");

        }
    }
}
