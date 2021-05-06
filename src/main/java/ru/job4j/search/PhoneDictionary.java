package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> personArrayList = new ArrayList<>();

    public void add(Person person) {
        this.personArrayList.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person findPerson: personArrayList) {
            if (findPerson.getName().contains(key) || findPerson.getSurname().contains(key)
            || findPerson.getTelephone().contains(key) || findPerson.getAddress().contains(key)) {
                result.add(findPerson);
            }
        }
        return result;
    }

}
