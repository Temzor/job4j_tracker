package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int workExperience;

    public Builder(int workExperience, String industry, String name,
                   String surname, String education, String birthday) {
        super(industry, name, surname, education, birthday);
        this.workExperience = workExperience;
    }
}
