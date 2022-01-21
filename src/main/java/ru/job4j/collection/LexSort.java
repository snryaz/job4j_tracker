package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Arr = o1.split(". ");
        String[] o2Arr = o2.split(". ");
        int o1Num = Integer.parseInt(o1Arr[0]);
        int o2Num = Integer.parseInt(o2Arr[0]);
        return Integer.compare(o1Num, o2Num);
    }
}
