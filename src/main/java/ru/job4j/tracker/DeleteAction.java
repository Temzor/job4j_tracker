package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ====");
        int idForDeleted = Integer.valueOf(input.askStr("Enter id of item to delete: "));
        if (tracker.delete(idForDeleted)) {
            out.println("The removal of the item was successful");
        } else {
            out.println("Item wasn't deleted, try again");
        }
        return true;
    }
}
