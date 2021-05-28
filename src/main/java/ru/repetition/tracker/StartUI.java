package ru.repetition.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("Test add");
        tracker.add(item);
        System.out.println(tracker.findById(item.getId()));
    }
}
