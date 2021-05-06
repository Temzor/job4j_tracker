package ru.job4j.poly;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по дорогам.");
    }

    @Override
    public void hasWheels() {
        System.out.println(getClass().getSimpleName() +  " передвигается по дорогам "
                + "только на колесах.");
    }
}
