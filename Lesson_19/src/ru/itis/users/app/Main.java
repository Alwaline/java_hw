package ru.itis.users.app;

import ru.itis.users.exceptions.EmailValidationException;
import ru.itis.users.exceptions.PasswordValidationException;
import ru.itis.users.services.MathService;
import ru.itis.users.services.UsersService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // UsersService service = new UsersService();

        // String email = scanner.nextLine();
        // String password = scanner.nextLine();

        // try {
        //     service.save(email, password);
        // // } catch (Exception e) { - ловит все исключения
        // // } catch (EmailValidationException e) { - ловит только EmailValidationException, на другом вываливает ошибку
        // } catch (PasswordValidationException e) { //- ловит только PasswordValidationException, на другом вываливает ошибку
            
        //     System.out.println("Там что-то не так произошло... " + e.getMessage());
        // }

        // System.out.println("Попробуйте в следующий раз");

        MathService service = new MathService();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            System.out.println(service.division(a, b));
        } catch (Exception e) {
            System.out.println("Там что-то пошло не так... " + e.getMessage());
        }
    }
}
