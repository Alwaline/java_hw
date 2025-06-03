package ru.itis.spring.users.repository;

import ru.itis.spring.users.data.ContactData;

import javax.sql.DataSource;

public class UsersRepositoryJdbcImpl implements UsersRepository {

    private final DataSource dataSource;

    public UsersRepositoryJdbcImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public ContactData findContactByUsername(String username) {
        System.out.println("Открываем соединение через dataSource -" + dataSource.toString());
        return new ContactData(1L, "sidikov@gmail.com", "792222222", "XXXXYYYYYXXX");
    }
}
