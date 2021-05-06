package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String patient;

    public Doctor(String patient, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.patient = patient;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}