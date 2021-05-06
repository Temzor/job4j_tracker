package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам.");
    }

    @Override
    public void hasWheels() {
        System.out.println(getClass().getSimpleName() + " имеет много колес, "
                + "для передвижению по рельсам.");
    }
}
