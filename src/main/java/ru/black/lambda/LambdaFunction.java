package ru.black.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaFunction {
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

        StudentInfo studentInfo = new StudentInfo();

        Function<Student, Double> studentDoubleFunction = student -> student.getAvgGrade() * 3;
        double resultAvg = avgOfStudent(students, student -> student.getAvgGrade());
        double resultCourse = avgOfStudent(students, student -> (double) student.getCourse());
        double resultAge = avgOfStudent(students, student -> (double) student.getAge());
        System.out.println(resultAvg);
        System.out.println(resultCourse);
        System.out.println(resultAge);
    }

    private static double avgOfStudent(List<Student> list,
                                       Function<Student, Double> doubleFunction) {
        double result = 0;
        for (Student student : list) {
            result += doubleFunction.apply(student);
        }
        result = result / list.size();
        return  result;
    }
}
