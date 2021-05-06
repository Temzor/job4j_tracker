package ru.job4j.search;

public class Person {
    private String name;
    private String surname;
    private String telephone;
    private String address;

    public Person(String name, String surname, String telephone, String address) {
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }
}

