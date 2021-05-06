package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String surgeonType;

    public Surgeon(String surgeonType, String patient, String name,
                   String surname, String education, String birthday) {
        super(patient, name, surname, education, birthday);
        this.surgeonType = surgeonType;
    }
}
