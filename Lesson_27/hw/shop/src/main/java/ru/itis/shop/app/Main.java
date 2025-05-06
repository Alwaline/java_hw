package ru.itis.shop.app;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import ru.itis.shop.account.repository.AccountRepository;
import ru.itis.shop.account.repository.impl.AccountRepositoryJdbcTemplateImpl;
import ru.itis.shop.account.service.AccountServive;

public class Main {

    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(Main.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        
        HikariConfig config = new HikariConfig(properties);
        DataSource dataSource = new HikariDataSource(config);

        AccountRepository accountRepository = new AccountRepositoryJdbcTemplateImpl(dataSource);
        AccountServive servive = new AccountServive(accountRepository);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Показать всех пользователей");
            System.out.println("2. Добавить пользователя");
            System.out.println("3. Поиск пользователя по id");
            System.out.println("0. Выход");

            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println(servive.getAllAccounts());
                    break;
                case "2":
                    String firstName = scanner.nextLine();
                    String lastName = scanner.nextLine();
                    String email = scanner.nextLine();
                    String password = scanner.nextLine();
                    Integer age = scanner.nextInt();
                    scanner.nextLine();
                    servive.signUp(firstName, lastName, email, password, age);
                    break;
                case "3":
                    Integer id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(servive.findById(id));
                case "0":
                    scanner.close();
                    System.exit(0);
            }
            
        }
    }

}
