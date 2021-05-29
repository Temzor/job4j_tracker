package ru.black.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("By");
        arrayList.add("Ok");
        arrayList.add("Learn java");
        arrayList.add("namely lambdas");
//        arrayList.removeIf(element -> element.length() < 5);
        Predicate<String> stringPredicate = element -> element.length() < 5;
        arrayList.removeIf(stringPredicate);
        System.out.println(arrayList);
    }
}
