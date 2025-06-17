package ru.itis.shop.accounts.repository;

import ru.itis.shop.accounts.entity.Account;

import java.util.List;

public interface AccountsRepository {

    List<Account> findAll();

    void save(Account account);

    Account findById(Integer id);
}
