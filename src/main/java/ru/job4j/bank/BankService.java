package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User userFound = findByPassport(passport);
        if (userFound != null) {
            List<Account> accountFound = users.get(userFound);
            if (!accountFound.contains(account)) {
                accountFound.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User foundUser : users.keySet()) {
            if (foundUser.getPassport().equals(passport)) {
                return foundUser;
            }
        }
        return null;
    }

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
