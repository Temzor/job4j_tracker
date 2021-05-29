package ru.black.lambda;

public class Lambda {
    @SuppressWarnings("checkstyle:MethodParamPad")
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        def((String str) -> {
            return str.length();
        });
    }
}

interface  I {
    @SuppressWarnings("checkstyle:MethodParamPad")
    int abc(String s);
}
