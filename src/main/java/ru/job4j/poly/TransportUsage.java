package ru.job4j.poly;

public class TransportUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[] {airplane, train, bus};
        for (Vehicle v : vehicles) {
            v.move();
            v.hasWheels();
        }
    }
}
