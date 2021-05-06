package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by Id ====");
        int idForFind = Integer.valueOf(input.askStr("Enter id to search: "));
        Item idFind = tracker.findById(idForFind);
        if (idFind != null) {
            out.println("Item was founded. Its name is " + idFind.getName());
        } else {
            out.println("Application with this id was not found");
        }
        return true;
    }
}
