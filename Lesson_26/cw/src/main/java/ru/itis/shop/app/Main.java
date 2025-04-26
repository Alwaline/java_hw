package ru.itis.shop.app;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import ru.itis.shop.account.repository.AccountRepository;
import ru.itis.shop.account.repository.impl.AccountRepositoryJdbcImpl;
import ru.itis.shop.account.service.AccountService;

import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(Main.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

        HikariConfig config = new HikariConfig();
        config.setDriverClassName(properties.getProperty("db.jdbc.driver-class-name"));
        config.setJdbcUrl(properties.getProperty("db.jdbc.url"));
        config.setUsername(properties.getProperty("db.jdbc.username"));
        config.setPassword(properties.getProperty("db.jdbc.password"));

        HikariDataSource dataSource = new HikariDataSource(config);

        AccountRepository accountRepository = new AccountRepositoryJdbcImpl(dataSource);
        AccountService service = new AccountService(accountRepository);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Показать все почты");
            System.out.println("2. Добавить пользователя");
            System.out.println("0. Выход из приложения");

            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println(service.getAllEmails());
                    break;
                case "2":
                    String firstName = scanner.nextLine();
                    String lastName = scanner.nextLine();
                    String email = scanner.nextLine();
                    String password = scanner.nextLine();
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    service.signUp(firstName, lastName, email, password, age);
                    break;
                case "0":
                    System.exit(0);
            }
        }



    }
}
