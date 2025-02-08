package ru.itis.users.notifiers;

import ru.itis.users.models.User;

public class SmsNotifier extends AbstractNotifier {

    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Смс оповещение по номеру " + user.getPhone() + " текст " + message);
    }

}
