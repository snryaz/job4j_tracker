package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> number = new HashSet<>();
        for (Task numbers : list) {
            number.add(numbers.getNumber());
        }
        return number;
    }
}
