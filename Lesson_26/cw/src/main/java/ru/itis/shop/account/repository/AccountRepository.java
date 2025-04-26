package ru.itis.shop.account.repository;

import ru.itis.shop.account.entity.Account;

import java.util.List;

public interface AccountRepository {

    List<Account> findAll();

    void save(Account account);
}
