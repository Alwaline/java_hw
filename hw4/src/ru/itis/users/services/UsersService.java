package ru.itis.users.services;

import ru.itis.users.models.User;
import ru.itis.users.notifiers.AbstractNotifier;
import ru.itis.users.repositories.UsersRepository;

import java.util.UUID;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersService {

    private final UsersRepository repository;

    private final AbstractNotifier notifier;

    public UsersService(AbstractNotifier notifier) {
        this.repository = new UsersRepository();
        this.notifier = notifier;
    }

    public void addUser(String email, String password, String phone) {
        User user = new User(UUID.randomUUID().toString(), email, password, phone);

        repository.save(user);

        notifier.notifyUser(user, "пользователь с email " + user.getEmail() + " успешно зарегистрирован");

    }

    public void delUser(String email) {
        repository.del(email);
    }
}
