package ru.itis.shop.app;

import ru.itis.shop.account.entity.Account;
import ru.itis.shop.account.repository.AccountRepository;
import ru.itis.shop.account.repository.impl.AccountRepositoryJdbcImpl;
import ru.itis.shop.utils.DbUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        DbUtil dbUtil = new DbUtil();

        AccountRepository accountRepository = new AccountRepositoryJdbcImpl(dbUtil.getConnection());

        long before = System.currentTimeMillis();
        try (ExecutorService executorService = Executors.newFixedThreadPool(10)) {
            for (int threadNumber = 0; threadNumber < 10; threadNumber++) {
                int finalThreadNumber = threadNumber;

                executorService.submit(() -> {
                    for (int i = 0; i < 10_000; i++) {
                        String userData = "Test " + i + " by Thread " + finalThreadNumber;
                        Account account = new Account(userData, userData, userData, userData, 1);

                        accountRepository.save(account);
                    }
                });
            }


        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        long after = System.currentTimeMillis();

        System.out.println((after - before) / 1000);

    }
}
