package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String specialization;

    public Dentist(String specialization, String patient, String name, String surname, String education, String birthday) {
        super(patient, name, surname, education, birthday);
        this.specialization = specialization;
    }
}
