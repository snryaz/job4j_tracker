package ru.job4j.collection;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person persons : person) {
            if (persons.getName().contains(key) || persons.getSurname().contains(key)
            || persons.getPhone().contains(key) || persons.getAddress().contains(key)) {
                result.add(persons);
            }
        }
        return result;
    }
}
