package ru.job4j.oop;
/**
 * Класс описывает принципы ООП
 * @author Dnitrii Kapustin
 * @version 1.0
 */

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);

    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black");
        black.show();

    }
}
