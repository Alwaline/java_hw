package ru.itis.users.repositories;

import ru.itis.users.model.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryListImpl implements UsersRepository {

    private final List<User> users;

    public UsersRepositoryListImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }
}
