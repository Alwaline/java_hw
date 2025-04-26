package ru.itis.shop.app;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import ru.itis.shop.account.entity.Account;
import ru.itis.shop.account.repository.AccountRepository;
import ru.itis.shop.account.repository.impl.AccountRepositoryJdbcImpl;

import java.util.Properties;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(Main3.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

        HikariConfig config = new HikariConfig();
        config.setDriverClassName(properties.getProperty("db.jdbc.driver-class-name"));
        config.setJdbcUrl(properties.getProperty("db.jdbc.url"));
        config.setUsername(properties.getProperty("db.jdbc.username"));
        config.setPassword(properties.getProperty("db.jdbc.password"));
        config.setMaximumPoolSize(30);

        HikariDataSource dataSource = new HikariDataSource(config);

        AccountRepository accountRepository = new AccountRepositoryJdbcImpl(dataSource);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        long before = System.currentTimeMillis();

        for (int threadNumber = 0; threadNumber < 20; threadNumber++) {
            for (int i = 0; i < 10_000; i++) {
                String userData = "Test " + i + " by Thread " + threadNumber;
                Account account = new Account(userData, userData, userData, userData, 1);
                accountRepository.save(account);
            }
        }

        long after = System.currentTimeMillis();

        System.out.println((after - before) / 1000);

    }
}
