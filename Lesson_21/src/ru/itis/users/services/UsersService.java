package ru.itis.users.services;

import ru.itis.users.exceptions.EmailValidationException;
import ru.itis.users.exceptions.PasswordValidationException;
import ru.itis.users.model.User;
import ru.itis.users.repositories.UsersRepository;
import ru.itis.users.repositories.UsersRepositoryFileImpl;
import ru.itis.users.repositories.UsersRepositoryListImpl;

import java.util.ArrayList;
import java.util.List;

public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void signUp(String email, String password) throws EmailValidationException {

        if (!email.contains("@")) {
            throw new EmailValidationException("Missing @ character");
        }

        if (password.length() < 5) {
            throw new PasswordValidationException("Short length");
        }

        User user = new User(email, password);

        usersRepository.save(user);
    }

    public List<String> getAllEmails() {
        List<User> users = usersRepository.findAll();

        List<String> emails = new ArrayList<>();

        for (User user : users) {
            emails.add(user.getEmail());
        }

        return emails;
    }
}
