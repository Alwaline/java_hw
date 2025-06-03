package ru.itis.spring.users.repository;

import ru.itis.spring.users.data.ContactData;

public interface UsersRepository {

    ContactData findContactByUsername(String username);
}
