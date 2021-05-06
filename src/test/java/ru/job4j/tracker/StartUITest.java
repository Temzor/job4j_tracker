package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    private String lineSeparator = System.lineSeparator();

    @Test
    public void whenCreateItem() {
        Output output = new ConsoleOutput();
        Input input = new StubInput(
                new String[]{"0", "New Item", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("New Item"));
    }

    @Test
    public void whenEditAction() {
        Output output = new ConsoleOutput();
        Input input = new StubInput(
                new String[]{"0", "1", "Renamed Item", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New Item"));
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ReplaceAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is("Renamed Item"));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Deleted item");
        tracker.add(item);
        String strId = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[]{"0", strId, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new DeleteAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

        @Test
    public void whenFindByNameAction() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[]{
                "0", "New", "1",
        });
        Item item = new Item("New");
        Tracker tracker = new Tracker();
        tracker.add(item);
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindByNameAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Menu." + lineSeparator
                + "0. Find items by name" + lineSeparator
                + "1. Exit" + lineSeparator
                + "=== Find items by name ====" + lineSeparator
                + item + lineSeparator
                + "Menu." + lineSeparator
                + "0. "
                + "Find items by name" + lineSeparator
                + "1. Exit" + lineSeparator
        ));
    }

    @Test
    public void whenFindByIdAction() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[]{
                "0", "1", "1"
        });
        Item item = new Item("New Item");
        Tracker tracker = new Tracker();
        tracker.add(item);
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindByIdAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Menu." + lineSeparator
                + "0. Find item by Id" + lineSeparator
                + "1. Exit" + lineSeparator
                + "=== Find item by Id ====" + lineSeparator
                + "Item was founded. Its name is New Item" + lineSeparator
                + "Menu." + lineSeparator
                + "0. Find item by Id" + lineSeparator
                + "1. Exit" + lineSeparator
        ));
    }

    @Test
    public void whenShowAllAction() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[]{
                "0", "1"
        });
        Item itemOne = new Item("First Item");
        Item itemTwo = new Item("Second Item");
        Tracker tracker = new Tracker();
        tracker.add(itemOne);
        tracker.add(itemTwo);
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ShowAllAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Menu." + lineSeparator
                + "0. Show all items" + lineSeparator
                + "1. Exit" + lineSeparator
                + "=== Show all items ====" + lineSeparator
                + itemOne + lineSeparator
                + itemTwo + lineSeparator
                + "Menu." + lineSeparator
                + "0. "
                + "Show all items" + lineSeparator
                + "1. Exit" + lineSeparator
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[] {"10", "0" /* Пункты меню: неверный, верный.*/ }
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(output));
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + lineSeparator
                        + "0. Exit" + lineSeparator
                        + "Wrong input, you can select: : 0..0" + lineSeparator
                        + "Menu." + lineSeparator
                        + "0. Exit" + lineSeparator
                )
        );
    }

    @Test
    public void whenExit() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(output));
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + lineSeparator
                        + "0. Exit" + lineSeparator
        ));
    }
}