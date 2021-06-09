package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> checkByName = c -> c.getName().contains(key);
        Predicate<Person> checkBySurname = c -> c.getSurname().contains(key);
        Predicate<Person> checkByTelephone = c -> c.getTelephone().contains(key);
        Predicate<Person> checkByAddress = c -> c.getAddress().contains(key);

        var combine = checkByName
                .or(checkBySurname)
                .or(checkByTelephone)
                .or(checkByAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}