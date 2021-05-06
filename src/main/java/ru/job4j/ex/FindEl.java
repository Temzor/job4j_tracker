package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
                System.out.println("Найденный индекс: " + index + " "
                       + "с значением: " + value[index]);
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] value = {"1", "2", "3", "4", "5", "6", "7", "8"};
        try {
            indexOf(value, "1");
            indexOf(value, "9");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}