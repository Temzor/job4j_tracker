package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SchoolToMap {
    public Map<String, Student> collect(List<Student> students) {
        return students
                .stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        student -> student,
                        (student, studentDuplicate) ->
                                student.getSurname().equals(studentDuplicate.getSurname())
                                       ? student : studentDuplicate
                 ));

    }
}