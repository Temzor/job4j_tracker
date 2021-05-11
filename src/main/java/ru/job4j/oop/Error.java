package ru.job4j.oop;
/**
 * Класс описывает принципы ООП
 * @author Dnitrii Kapustin
 * @version 1.0
 */
public class Error {
    private boolean active;

    private int status;

    private String message;

    public  Error() {
    }

    public  Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Подтверждение ошибки : " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение в ошибке: " + message);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();
        Error error = new Error(true, 1, "java.io.IOException");
        error.printInfo();
    }
}
