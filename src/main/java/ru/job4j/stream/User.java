package ru.job4j.stream;

import java.util.List;

public class User {
    private String name;
    private String surname;
    private byte age;
    private String login;
    private String password;
    private boolean activated;
    private String gender;

    public User(String name, String surname, byte age,
                String login, String password, boolean activated,
                String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
        this.activated = activated;
        this.gender = gender;
    }
}
