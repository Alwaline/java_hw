package ru.itis.users.app;

import ru.itis.users.services.UsersService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsersService service = new UsersService();

        String email = scanner.nextLine();
        String password = scanner.nextLine();


        service.save(email, password);


        System.out.println("Попробуйте в следующий раз");

    }
}
