package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> result = new ArrayList<>();
        while (it.hasNext()) {
            Iterator<Integer> integerIterator = it.next();
            while (integerIterator.hasNext()) {
                result.add(integerIterator.next());
            }
        }
        return result;
    }
}
