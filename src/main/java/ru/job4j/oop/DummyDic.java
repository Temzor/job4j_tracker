package ru.job4j.oop;
/**
 * Класс описывает принципы ООП
 * @author Dnitrii Kapustin
 * @version 1.0
 */

public class DummyDic {
    public  String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        String word = translator.engToRus("Java");
        System.out.println(word);
    }
}
