package src.app;

import java.util.Scanner;

import src.account.repository.AccountRepository;
import src.account.repository.impl.AccountRepositoryJdbcImpl;
import src.account.service.AccountServive;
import src.utils.DbUtil;

public class Main {

    public static void main(String[] args) {
        DbUtil dbUtil = new DbUtil();

        AccountRepository accountRepository = new AccountRepositoryJdbcImpl(dbUtil.getConnection());
        AccountServive servive = new AccountServive(accountRepository);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Показать всех пользователей");
            System.out.println("2. Добавить пользователя");
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
                case "0":
                    System.exit(0);
            }
            
        }
    }

}
