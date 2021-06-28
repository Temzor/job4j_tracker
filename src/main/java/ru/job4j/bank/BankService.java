package ru.job4j.bank;
/*
 * Класс описывает работу банковской системы в которой можно
 * зарегистрировать пользователя, добавить пользователя, добавлять пользователю
 * банковский счет, изменять баланс по средтвам переводов между счетами
 * @author Dnitrii Kapustin
 * @version 1.0
 */

import java.util.*;

public class BankService {

    /**
     * Данное поле описывает пользователей системы с привязаными к ним счетам
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Данный метод добавляет пользователя в систему, при условии
     * если пользоатель отсутвует в системе
     * принимает два парарметра: пользователя и список счетов
     * @param user пользователь который добавляется в hash.map()
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Данный метод, добавляет счет пользователю, если его нет
     * работает при условии: если пользователь существует, и нет счета
     * @param passport паспорт пользователя, который принимает метод
     * @param account счет пользователя, который принимает метод
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * Данный метод производит поиск пользователя по паспорту
     * @param passport паспорт пользователя, который принимает метод и по которому происходит поиск
     * @return возвращается пользователь, через stream
     */
    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Данный метод производит поиск счета пользователя по реквизитам
     * если пользователь найден, то получаем список счетов
     * циклом сравнимаем реквизиты, если они совпадают то возвращаем их
     * @param passport паспорт пользователя, который принимает метод и
     *            по которому осуществляется поиск пользователя
     * @param requisite реквизит который принимает метод и
     *             по которому происходит идентификация реквизитов в листе
     * @return возвращает пользователя если он найден, через поток stream
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> userByRequisite = findByPassport(passport);
        return userByRequisite.flatMap(user -> users.get(user)
                .stream()
                .filter(r -> r.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод производит перевод с одного счета на другой
     * @param srcPassport паспорт, который принмает метод и откуда осущетвляем
     *                    перевод
     * @param srcRequisite реквизит, который принимает метод и откуда осущетвляем
     *                     перевод
     * @param destPassport паспорт, который принмает метод и куда осущетвляем
     *                          перевод
     * @param destRequisite реквизит, который принимает метод и куда осущетвляем
     *                          перевод
     * @param amount денежные средвта, которые будут переводиться с одного счета на другой
     * @return Если счёт не найден или не хватает денег на счёте srcAccount -  откуда осущетвляем
     *                           перевод, то метод вернет false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent()
                && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            result = true;
    }
        return result;
    }
}