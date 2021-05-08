package ru.job4j.bank;

/**
 * Класс описывает счет ползователя
 * @author Dnitrii Kapustin
 * @version 1.0
 */

import java.util.Objects;

public class Account {
    /**
     * Поля с модификтором доступа private
     * поле requisite является реквизитами счета пользователя
     * поле balance является балансом счета пользователя
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор класса
     * @param requisite принимает реквизит счета пользователя
     * @param balance принимает баланс счета пользователя
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод getter для доступа к приватному полю класса
     * @return возвращает поле requisite класса
     *
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод setter для изменения приватоного поля класса requisite
     * @param requisite производит присваивания значения requisite класса, к переданному значению
     *
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод getter для доступа к приватному полю класса
     * @return возвращает поле balance класса
     *
     */
    public double getBalance() {
        return balance;
    }

    /**
     * метод setter для изменения приватоного поля класса requisite
     * @param balance производит присваивания значения balance класса, к переданному значению
     *
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *  Равенство элементов класса определяется методами equals() и hashcode(),
     *  которые определены в классе Object.
     *  Переопределяем данные методы для корректной работы сравнения объетов класса
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}