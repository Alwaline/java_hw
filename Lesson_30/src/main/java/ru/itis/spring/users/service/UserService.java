package ru.itis.spring.users.service;

import ru.itis.spring.users.data.ContactData;
import ru.itis.spring.users.notifiers.Notifier;
import ru.itis.spring.users.repository.UsersRepository;

import java.util.UUID;

public class UserService {

    private final UsersRepository usersRepository;
    private final Notifier notifier;

    public UserService(UsersRepository usersRepository, Notifier notifier) {
        this.usersRepository = usersRepository;
        this.notifier = notifier;
    }

    public void signIn(String username, String password) {
        System.out.println("Проверяем логин и пароль...");

        ContactData data = usersRepository.findContactByUsername(username);

        notifier.notify(data, "Ваш код авторизации - " + UUID.randomUUID());
    }
}
