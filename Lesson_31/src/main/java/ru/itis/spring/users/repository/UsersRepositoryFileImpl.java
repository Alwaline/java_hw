package ru.itis.spring.users.repository;

import ru.itis.spring.users.data.ContactData;

public class UsersRepositoryFileImpl implements UsersRepository {

    private final String filePath;

    public UsersRepositoryFileImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public ContactData findContactByUsername(String username) {
        System.out.println("Открываем файл " + filePath + " и возвращаем пользователя...");
        return new ContactData(1L, "sidikov@gmail.com", "792222222", "XXXXYYYYYXXX");
    }
}
