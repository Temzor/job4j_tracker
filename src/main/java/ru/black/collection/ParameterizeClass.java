package ru.black.collection;

public class ParameterizeClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s1  = info1.getValue();
        System.out.println(s1);

        Info<Integer> info2 = new Info<>(19);
        System.out.println(info2);
        Integer s2  = info2.getValue();
        System.out.println(s2);
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
