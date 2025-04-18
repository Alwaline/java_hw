package ru.itis.shop.app;

import ru.itis.shop.account.entity.Account;
import ru.itis.shop.account.repository.AccountRepository;
import ru.itis.shop.account.repository.impl.AccountRepositoryJdbcImpl;
import ru.itis.shop.account.service.AccountService;
import ru.itis.shop.utils.DbUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DbUtil dbUtil = new DbUtil();

        AccountRepository accountRepository = new AccountRepositoryJdbcImpl(dbUtil.getConnection());
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
