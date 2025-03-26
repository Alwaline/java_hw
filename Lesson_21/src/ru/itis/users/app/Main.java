package ru.itis.users.app;

import ru.itis.users.exceptions.EmailValidationException;
import ru.itis.users.exceptions.PasswordValidationException;
import ru.itis.users.repositories.UsersRepositoryFileImpl;
import ru.itis.users.repositories.UsersRepositoryListImpl;
import ru.itis.users.services.UsersService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UsersRepositoryListImpl usersRepositoryList = new UsersRepositoryListImpl();
        UsersRepositoryFileImpl usersRepositoryFile = new UsersRepositoryFileImpl("users.txt");
        UsersService service = new UsersService(usersRepositoryList);

        while (true) {
            System.out.println("1. Добавить пользователя");
            System.out.println("2. Показать email всех пользователей");
            System.out.println("0. Выход");

            String command = scanner.nextLine();

            switch (command) {
                case "1": {
                    String email = scanner.nextLine();
                    String password = scanner.nextLine();


                    service.signUp(email, password);

                    break;
                }
                case "2": {

                    List<String> emails = service.getAllEmails();

                    System.out.println(emails);
                    break;
                }
                case "0": {
                    System.exit(0);
                }
            }
        }
    }
}
