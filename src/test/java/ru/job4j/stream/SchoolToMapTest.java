package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolToMapTest {
    @Test
    public void whenListToMapWithOutDuplicate() {
        List<Student> students = List.of(
                new Student(10, "Ivanov"),
                new Student(20, "Petrov"),
                new Student(30, "Sidorov")
        );

        SchoolToMap schoolToMap = new SchoolToMap();
        Map<String, Student> result = schoolToMap.collect(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivanov", new Student(10, "Ivanov"));
        expected.put("Petrov", new Student(20, "Petrov"));
        expected.put("Sidorov",  new Student(30, "Sidorov"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenListToMapWithDuplicate() {
        List<Student> students = List.of(
                new Student(10, "Ivanov"),
                new Student(20, "Petrov"),
                new Student(30, "Sidorov"),
                new Student(10, "Ivanov"),
                new Student(20, "Petrov"),
                new Student(30, "Sidorov")
        );

        SchoolToMap schoolToMap = new SchoolToMap();
        Map<String, Student> result = schoolToMap.collect(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivanov", new Student(10, "Ivanov"));
        expected.put("Petrov", new Student(20, "Petrov"));
        expected.put("Sidorov",  new Student(30, "Sidorov"));
        expected.put("Ivanov", new Student(10, "Ivanov"));
        expected.put("Petrov", new Student(20, "Petrov"));
        expected.put("Sidorov",  new Student(30, "Sidorov"));
        assertThat(result, is(expected));
    }
}