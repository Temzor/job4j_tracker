
package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void whenSortByNameItems() {
        List<Item> items = Arrays.asList(
                new Item(1, "one"),
                new Item(4, "four"),
                new Item(2, "Two"),
                new Item(3, "Three")
        );
        List<Item> expect = Arrays.asList(
                new Item(1, "one"),
                new Item(2, "Two"),
                new Item(3, "Three"),
                new Item(4, "four")
        );
        Collections.sort(items);
        assertThat(items, is(expect));
    }

    @Test
    public void whenReverseSortItemsByID() {
        List<Item> items = Arrays.asList(
                new Item(1, "one"),
                new Item(4, "four"),
                new Item(2, "Two"),
                new Item(3, "Three")
        );
        List<Item> expected = Arrays.asList(
                new Item(4, "four"),
                new Item(3, "Three"),
                new Item(2, "Two"),
                new Item(1, "one")
        );
        Collections.sort(items, Collections.reverseOrder());
        assertThat(items, is(expected));
    }

    @Test
    public void whenSortByNameItemsForClass() {
        List<Item> items = Arrays.asList(
                new Item(2, "two"),
                new Item(1, "one")
        );
        List<Item> expect = Arrays.asList(
                new Item(1, "one"),
                new Item(2, "two")
        );
        Collections.sort(items, new SortByNameItems());
        assertThat(items, is(expect));
    }

    @Test
    public void whenReverseSortByNameItemsForClass() {
        List<Item> items = Arrays.asList(
                new Item(1, "one"),
                new Item(2, "two")
        );
        List<Item> expect = Arrays.asList(
                new Item(2, "two"),
                new Item(1, "one")
        );
        Collections.sort(items, new ReversSortItemByNameItems());
        assertThat(items, is(expect));
    }
}