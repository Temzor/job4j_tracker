package ru.black.lambda;


import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> a1, StudentsChecks sc) {
        for (Student s : a1) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, (Student s) -> {
            return s.getAvgGrade() > 8;
        });
        System.out.println("-----------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.getAge() < 30;
        });
        System.out.println("-----------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.getAge() > 20 && s.getAvgGrade() < 9.3 && s.getSex() == 'f';
        });
    }

    interface StudentsChecks {
        boolean check(Student s);
    }
}




