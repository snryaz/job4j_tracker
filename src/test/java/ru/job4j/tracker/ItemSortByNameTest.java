package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSortByNameTest {

    @Test
    public void whenAscByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "B"),
                new Item(2, "A"),
                new Item(3, "C")
        );
        Comparator testItems = new ItemAscByName();
        Collections.sort(items, testItems);
        List<Item> expected = Arrays.asList(
                new Item(2, "A"),
                new Item(1, "B"),
                new Item(3, "C")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void whenDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "B"),
                new Item(2, "A"),
                new Item(3, "C")
        );
        Comparator testItems = new ItemDescByName();
        Collections.sort(items, testItems);
        List<Item> expected = Arrays.asList(
                new Item(3, "C"),
                new Item(1, "B"),
                new Item(2, "A")
        );
        assertThat(items, is(expected));
    }
}