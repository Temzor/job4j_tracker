package ru.training.codewars;

public class ProdFib { // must be public for codewars

    public static long[] productFib(long prod) {
        long f1 = 1;
        long f2 = 1;
        long sum = f1 + f2;
        long defProd = f1 * f2;

        while (defProd < prod) {
            f1 = f2;
            f2 = sum;
            sum = f1 + f2;
            defProd = f1 * f2;
        }

        return new long[]{f1, f2, defProd == prod ? 1 : 0};
    }
}