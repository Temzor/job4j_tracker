package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (index > 0 && !check.contains(str))
            check.add(index, str);
        return check.size() != list.size();
    }
}