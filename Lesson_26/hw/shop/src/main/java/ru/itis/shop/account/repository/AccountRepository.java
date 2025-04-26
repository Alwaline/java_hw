package ru.itis.shop.account.repository;

import java.util.List;

import ru.itis.shop.account.models.Account;

public interface AccountRepository {
    List<Account> findAll();

    void save(Account account);
}
