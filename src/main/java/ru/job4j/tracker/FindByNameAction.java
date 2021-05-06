package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ====");
        String nameForFind = input.askStr("Enter name to search: ");
        List<Item> nameFind = tracker.findByName(nameForFind);
        if (nameFind.size() != 0) {
            for (Item nameFinds : nameFind) {
                out.println(nameFinds);
            }
        } else {
            out.println("Items weren't find");
        }
        return true;
    }
}