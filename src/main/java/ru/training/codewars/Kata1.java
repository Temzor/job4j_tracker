package ru.training.codewars;

public class Kata1 {

    public static String encrypt(final String text, final int n) {
        String str = text;
        for (int i = 0; i < n; i++) {
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    a.append(str.charAt(j));
                } else {
                    b.append(str.charAt(j));
                }
            }
            str = b + a.toString();
        }
        return str;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String str = encryptedText;
        for (int i = 0; i < n; i++) {
            String a = str.substring(0, str.length() / 2);
            String b = str.substring(str.length() / 2);
            StringBuilder var = new StringBuilder();
            for (int j = 0; j < b.length(); j++) {
                var.append(b.charAt(j));
                if (j < a.length()) {
                    var.append(a.charAt(j));
                }
            }
            str = var.toString();
        }
        return str;
    }
}