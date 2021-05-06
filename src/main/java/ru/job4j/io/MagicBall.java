package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();

        if (answer == 1) {
            System.out.println("Да");
        } else if (answer == 2) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
