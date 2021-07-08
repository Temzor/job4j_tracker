package ru.training.codewars;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) {
                if (i == 0) {
                    result.append("(").append(numbers[i]);
                } else if (i == 2) {
                    result.append(") ");
                } else {
                    result.append(numbers[i]).append(numbers[2]);
                }
            } else if (i < 6) {
                if (i == 5) {
                    result.append(numbers[5]).append("-");
                } else {
                    result.append(numbers[i]);
                }
            } else {
                result.append(numbers[i]);
            }
        }
        return String.valueOf(result);
    }
}