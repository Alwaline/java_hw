package ru.itis.users.services;

import ru.itis.users.exceptions.EmailValidationException;
import ru.itis.users.exceptions.PasswordValidationException;

public class UsersService {

    public void save(String email, String password) {
        if (!email.contains("@")) {
            throw new EmailValidationException("Missing @ character");
        }

        if (password.length() < 5) {
            throw new PasswordValidationException("Short length");
        }

        System.out.println("Данные сохраняются в базе");
    }
}
