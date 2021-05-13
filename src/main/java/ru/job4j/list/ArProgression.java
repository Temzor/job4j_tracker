package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int result = data.get(0) + data.get(data.size() - 1) + data.get(data.size() - 2);
        for (int datum = 1; datum < data.size() - 2; datum++) {
            if (data.get(datum + 1) != (data.get(datum) + data.get(datum + 2)) / 2) {
                result = 0;
                break;
            } else {
                result += data.get(datum);
            }
        }
        return result;
    }
}