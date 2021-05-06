package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int percent) {
        this.load = percent;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(20);
        Battery secondBattery = new Battery(30);
        System.out.println("Начальное состояние: заряд первой батареи - " + firstBattery.load
                +
                ", заряд второй батареи - " + secondBattery.load);
        secondBattery.exchange(firstBattery);

        System.out.println("Конечное состояние после, зарядки: заряд первой батареи - "
                + firstBattery.load + ", заряд второй батареи - " + secondBattery.load);
    }
}
