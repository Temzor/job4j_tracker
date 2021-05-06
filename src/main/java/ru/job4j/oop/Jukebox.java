package ru.job4j.oop;

public class Jukebox {
    public void music(int postition) {
        if (postition == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (postition == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");

        }
    }

    public static void main(String[] args) {
        Jukebox bar = new Jukebox();
        bar.music(1);
        bar.music(2);
        bar.music(99);
    }
}
