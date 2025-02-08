package ru.itis.users.app;

import ru.itis.users.controllers.UsersController;
import ru.itis.users.notifiers.SmsNotifier;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        SmsNotifier notifier = new SmsNotifier();
        UsersController usersController = new UsersController(notifier);
        usersController.run();
    }
}
