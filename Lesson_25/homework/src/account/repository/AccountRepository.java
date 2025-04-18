package src.account.repository;

import java.util.List;

import src.account.models.Account;

public interface AccountRepository {
    List<Account> findAll();

    void save(Account account);
}
