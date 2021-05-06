package ru.job4j.io;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches < 4) {
                count -= matches;
                System.out.println("Осталось: " + count + " спичек.");
                turn = !turn;
            } else {
                System.out.println("По правилам игры нужно брать от 1 до 3 спичек"
                        + " попробуйте еще раз.");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}