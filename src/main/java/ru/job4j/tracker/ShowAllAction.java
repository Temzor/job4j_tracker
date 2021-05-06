package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction  implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        List<Item> arrayAll = tracker.findAll();
        if (arrayAll.size() != 0) {
            for (Item allArray : arrayAll) {
                out.println(allArray);
            }
        } else {
            out.println("Now there are no items");
        }
        return true;
    }
}
