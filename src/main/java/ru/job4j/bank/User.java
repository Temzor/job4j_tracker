package ru.job4j.bank;
/**
 * Класс описывает пользователя банка
 * @author Dnitrii Kapustin
 * @version 1.0
 */

import java.util.Objects;

public class User {
    /**
     * Поля с модификтором доступа private
     * поле passport является данными паспорта пользователя
     * поле username является именем пользователя
     */
    private String passport;
    private String username;

    /**
     * Конструктор класса
     * @param passport пасспорт пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод getter для доступа к приватному полю класса
     * @return возвращает поле passport класса
     *
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод setter для изменения приватоного поля класса passport
     * @param passport производит присваивания значения passport класса, к переданному значению
     *
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод getter для доступа к приватному полю класса
     * @return username поле passport класса
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод setter для изменения приватоного поля класса username
     * @param username производит присваивания значения username класса, к переданному значению
     *
     */
    public void setUsername(String username) {
        this.username = username;
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}