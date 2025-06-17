package ru.itis.shop.accounts.service;

import org.springframework.stereotype.Service;
import ru.itis.shop.accounts.entity.Account;
import ru.itis.shop.accounts.repository.AccountsRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountsService {

    private final AccountsRepository accountsRepository;

    public AccountsService(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    public List<String> getAllEmails() {
        return accountsRepository.findAll()
                .stream()
                .map(Account::getEmail)
                .collect(Collectors.toList());
    }

    public void signUp(String firstName, String lastName, String email, String password, int age) {
        Account account = new Account(firstName, lastName, email, password, age);

        accountsRepository.save(account);
    }

}
