package ru.itis.shop.app;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import ru.itis.shop.account.entity.Account;
import ru.itis.shop.account.repository.AccountRepository;
import ru.itis.shop.account.repository.impl.AccountRepositoryJdbcTemplateImpl;

import javax.sql.DataSource;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(Main.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

        HikariConfig config = new HikariConfig(properties);
        DataSource dataSource = new HikariDataSource(config);

        AccountRepository accountRepository = new AccountRepositoryJdbcTemplateImpl(dataSource);

        Account account = new Account("Marsel", "Sidikov", "sidikov.marsel@gmail.com", "qwerty007", 31);
        System.out.println(account);
        accountRepository.save(account);
        System.out.println(account);
    }
}
