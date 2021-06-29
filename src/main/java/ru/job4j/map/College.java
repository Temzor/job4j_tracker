package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> result = Optional.empty();
        for (Student student: students.keySet()) {
            if (account.equals(student.getAccount())) {
                result = Optional.of(student);
                break;
            }
        }
        return result;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> result = Optional.empty();
        Optional<Student> student = findByAccount(account);
        if (student.isPresent()) {
            Set<Subject> subjects = students.get(student.get());
            for (Subject sub : subjects) {
                if (name.equals(sub.getName())) {
                    result = Optional.of(sub);
                    break;
                }
            }
        }
        return result;
    }
}