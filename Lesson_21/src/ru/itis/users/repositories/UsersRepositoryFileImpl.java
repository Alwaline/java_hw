package ru.itis.users.repositories;

import ru.itis.users.model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UsersRepositoryFileImpl implements UsersRepository {

    private final String fileName;

    public UsersRepositoryFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void save(User user) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(user.getEmail() + "|" + user.getPassword() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Не получилось поработать с файлом");
        }
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
