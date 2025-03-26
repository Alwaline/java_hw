package ru.itis.users.repositories;

import ru.itis.users.model.User;

import java.util.List;

public interface UsersRepository {
    void save(User user);

    List<User> findAll();
}
