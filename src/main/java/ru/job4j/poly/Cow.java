package ru.job4j.poly;

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносить звук: МУ-му.");
    }

}
