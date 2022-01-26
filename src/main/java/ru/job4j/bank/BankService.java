package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает простейшую модель банковской системы,
 * позволяющая регистрировать пользователя, удалять пользователя,
 * добавлять счет и переводить деньги между счетами
 * @author SERGEY RYAZANTSEV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение задания осуществляется в коллекции HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему,
     * при этом проводится проверка на уникальность пользователя
     * с помощью метода putIfAbsent
     * @param user пользователь, который добавляется в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет пользователю новый счет,
     * при этом проводится проверка, что такого счета у пользователя еще не существует
     * @param passport паспорт, по которому происходит поиск пользователя
     * @param account счет, который хотим добавить пользователю
     */
    public void addAccount(String passport, Account account) {
        User userFound = findByPassport(passport);
        if (userFound != null) {
            List<Account> accountFound = users.get(userFound);
            if (!accountFound.contains(account)) {
                accountFound.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту
     * @param passport паспорт, по которому происходит поиск пользователя
     * @return возвращает пользователя или null если пользователь не существует
     */
    public User findByPassport(String passport) {
        for (User foundUser : users.keySet()) {
            if (foundUser.getPassport().equals(passport)) {
                return foundUser;
            }
        }
        return null;
    }

    /**
     * Метод ищет нужный счет у пользователя
     * @param passport паспорт пользователя у которого ищем счет
     * @param requisite реквизиты счета, который ищем
     * @return возвращает счет или null если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User foundUser = findByPassport(passport);
        if (foundUser != null) {
            List<Account> foundUserAcc = users.get(foundUser);
            for (Account searchAcc : foundUserAcc) {
                if (searchAcc.getRequisite().equals(requisite)) {
                    return searchAcc;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит денежные средства с одного счета на другой
     * @param srcPassport паспорт пользователя у которого списываются денежные средства
     * @param srcRequisite реквизиты счета с которых списываются денежные средства
     * @param destPassport паспорт пользователя которому зачисляются денежные средства
     * @param destRequisite реквизиты счета на который зачисляются денежные средства
     * @param amount сумма, которая переводится с одного счета на другой
     * @return в случае успешного перевода возвращается true иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && amount > 0
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
