package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        ArrayList<Folder> arrayList = new ArrayList<>();
        for (Folder folder : list) {
            if (pred.test(folder)) {
                arrayList.add(folder);
            }
        }
        return arrayList;
    }
}