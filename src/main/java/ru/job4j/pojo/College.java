package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Kapustin");
        student.setName("Dmitrii");
        student.setGroup("IP-06-5R");
        student.setBegin(new Date());

        System.out.println("Student: " + student.getSurname() + " " + student.getName()
                + " group - " + student.getGroup() + " date begin study: " + student.getBegin());
    }
}
