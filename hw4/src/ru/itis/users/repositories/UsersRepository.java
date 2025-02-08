package ru.itis.users.repositories;

import ru.itis.users.models.User;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersRepository {
    private static final int MAX_USERS_COUNT = 10;

    private final User[] users;
    private int count;

    public UsersRepository() {
        this.users = new User[MAX_USERS_COUNT];
        this.count = 0;
    }

    public void save(User user) {
        if (count < MAX_USERS_COUNT) {
            this.users[count] = user;
            count++;
        } else {
            System.err.println("Хранилище переполнено");
        }
    }

    public void del(String email) {
        for (int i = 0; i < count; i++) {
            if (users[i].getEmail().equals(email)) {
                count--;
                users[i] = users[count];
            }
        }
    }
}
