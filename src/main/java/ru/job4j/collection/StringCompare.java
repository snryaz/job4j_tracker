package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int size = Math.min(o1.length(), o2.length());
        int rsl = 0;
        int reference = Integer.compare(o1.length(), o2.length());

        for (int i = 0; i < size; i++) {
            char ch1 = o1.charAt(i);
            char ch2 = o2.charAt(i);
            rsl = Character.compare(ch1, ch2);
            if (i == size - 1 && reference != 0) {
                rsl = reference;
            } else if (rsl != 0) {
                break;
            }
        }
        return rsl;
    }
}
