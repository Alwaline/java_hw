package ru.itis.users.controllers;

import ru.itis.users.notifiers.AbstractNotifier;
import ru.itis.users.services.UsersService;

import java.util.Scanner;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersController {

    private final Scanner scanner;

    private final UsersService service;

    public UsersController(AbstractNotifier notifier) {
        this.scanner = new Scanner(System.in);
        this.service = new UsersService(notifier);
    }

    public void run() {

        while (true) {
            printMainMenu();

            processCommandFromMainMenu();
        }
    }

    private void printMainMenu() {
        System.out.println("Добрый день!");
        System.out.println("Выберите необходимый пункт меню:");
        System.out.println("1. Добавить пользователя");
        System.out.println("2. Удалить пользователя");
        System.out.println("0. Выход");
    }

    private void processCommandFromMainMenu() {
        int command = scanner.nextInt();

        switch (command) {
            case 1 -> handleAddUser();
            case 2 -> handleDelUser();
            case 0 -> System.exit(0);
        }
    }

    private void handleAddUser() {
        System.out.println("Введите email пользователя:");
        scanner.nextLine();
        String email = scanner.nextLine();
        System.out.println("Введите пароль пользователя:");
        String password = scanner.nextLine();
        System.out.println("Введите номер телефона пользователя:");
        String phone = scanner.nextLine();

        service.addUser(email, password, phone);
    }

    private void handleDelUser() {
        System.out.println("Введите email пользователя:");
        scanner.nextLine();
        String email = scanner.nextLine();

        service.delUser(email);
    }

}
