package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ====");
        int idByUser = Integer.valueOf(input.askStr("Enter id of item to edit: "));
        String nameByUser = input.askStr("Enter name of new item: ");
        Item item = new Item(nameByUser);
        if (tracker.replace(idByUser, item)) {
            out.println("Item id: " + idByUser + " was successful, "
                    + "eventually changed to: " + item.getName() + ".");
        } else {
            out.println("The item cannot be changed.");
        }
        return true;
    }
}
