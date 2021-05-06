package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String industry;

    public Engineer(String industry, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Project heal(Industry industry) {
        return new Project();
    }
}