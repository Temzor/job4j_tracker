package ru.job4j.poly;

public interface Transport {
    void  go();

    void passengersInt(int passengers);

    default double refuel(double tankUp) {
        return tankUp * 47.80;
    }
}
