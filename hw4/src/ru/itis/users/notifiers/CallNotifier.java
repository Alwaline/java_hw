package ru.itis.users.notifiers;

import ru.itis.users.models.User;

public class CallNotifier extends AbstractNotifier{

    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Звонок-оповещение по номеру " + user.getPhone() + " текст " + message);
    }

}
