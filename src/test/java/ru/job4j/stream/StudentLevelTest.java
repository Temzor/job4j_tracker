package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<StudentApi> input = new ArrayList<>();
        input.add(new StudentApi("Masha", 28));
        input.add(new StudentApi("Pety", 128));
        List<StudentApi> expected = List.of(
                new StudentApi("Pety", 128),
                new StudentApi("Masha", 28)
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<StudentApi> input = new ArrayList<>();
        input.add(null);
        List<StudentApi> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<StudentApi> input = new ArrayList<>();
        input.add(null);
        input.add(new StudentApi("Pety", 28));
        List<StudentApi> expected = List.of(new StudentApi("Pety", 28));
        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }
}