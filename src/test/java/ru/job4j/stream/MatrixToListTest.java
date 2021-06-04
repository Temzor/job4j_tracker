package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixToListTest {
    @Test
    public void whenMatrixToMapToLineNumber() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> result = MatrixToList.toList(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMatrixToMapNotLineNumber() {
        Integer[][] matrix = {
                {1, 2, 5},
                {4, 5, 9},
                {7, 8, 12}
        };
        List<Integer> result = MatrixToList.toList(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 5, 4, 5, 9, 7, 8, 12);
        assertThat(result, is(expected));
    }

}