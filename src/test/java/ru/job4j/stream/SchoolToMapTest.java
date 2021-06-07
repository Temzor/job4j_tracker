package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolToMapTest {

    @Test
    public void whenToMapWithoutDuplicate() {
        List<Student> students = List.of(
                new Student(10, "Ivanov"),
                new Student(20, "Petrov"),
                new Student(30, "Sidorov"),
                new Student(40, "Kalugin"),
                new Student(50, "Vakhnin")
        );
        SchoolToMap schoolToMap = new SchoolToMap();
        Map<String, Student> result = schoolToMap.listMap(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivanov", new Student(10, "Ivanov"));
        expected.put("Petrov", new Student(20, "Petrov"));
        expected.put("Sidorov", new Student(30, "Sidorov"));
        expected.put("Kalugin", new Student(40, "Kalugin"));
        expected.put("Vakhnin", new Student(50, "Vakhnin"));
        assertThat(result, is(expected));
    }
    @Test
    public void whenToMapWithDuplicate() {
        List<Student> students = List.of(
                new Student(10, "Ivanov"),
                new Student(10, "Ivanov"),
                new Student(20, "Petrov"),
                new Student(20, "Petrov"),
                new Student(30, "Sidorov"),
                new Student(30, "Sidorov"),
                new Student(40, "Kalugin"),
                new Student(40, "Kalugin"),
                new Student(50, "Vakhnin"),
                new Student(50, "Vakhnin")
        );
        SchoolToMap schoolToMap = new SchoolToMap();
        Map<String, Student> result = schoolToMap.listMap(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivanov", new Student(10, "Ivanov"));
        expected.put("Petrov", new Student(20, "Petrov"));
        expected.put("Sidorov", new Student(30, "Sidorov"));
        expected.put("Kalugin", new Student(40, "Kalugin"));
        expected.put("Vakhnin", new Student(50, "Vakhnin"));
        assertThat(result, is(expected));
    }
}

