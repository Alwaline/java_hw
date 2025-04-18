package src.account.service;

import java.util.List;

import src.account.models.Account;
import src.account.repository.AccountRepository;

public class AccountServive {
    private final AccountRepository accountRepository;

    public AccountServive(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public void signUp(String firstName, String lastName, String email, String password, Integer age) {
        Account account = new Account(firstName, lastName, email, password, age);

        accountRepository.save(account);
    }


    
    
}
