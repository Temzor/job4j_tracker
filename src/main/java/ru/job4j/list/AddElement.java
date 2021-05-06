package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        boolean result = false;
        List<String> check = new ArrayList<>(list);
        check.add(str);
        if (list.size() != check.size()) {
            result = true;
        }
        return result;
    }
}