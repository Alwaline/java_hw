package ru.itis.shop.account.service;

import ru.itis.shop.account.entity.Account;
import ru.itis.shop.account.repository.AccountRepository;

import java.util.List;
import java.util.stream.Collectors;

public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<String> getAllEmails() {
        return accountRepository.findAll()
                .stream()
                .map(Account::getEmail)
                .collect(Collectors.toList());
    }

    public void signUp(String firstName, String lastName, String email, String password, int age) {
        Account account = new Account(firstName, lastName, email, password, age);

        accountRepository.save(account);
    }

}
