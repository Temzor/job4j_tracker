package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по воздуху.");
    }

    @Override
    public void hasWheels() {
        System.out.println(getClass().getSimpleName() + " использует колеса "
                + "только для посадки и взлета.");
    }
}
