package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String software;

    public Programmer(String industry, String name, String surname, String education, String birthday, String sowftware) {
        super(industry, name, surname, education, birthday);
        this.software = software;
    }
}