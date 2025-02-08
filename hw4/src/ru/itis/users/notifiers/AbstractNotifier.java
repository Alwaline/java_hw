package ru.itis.users.notifiers;

import ru.itis.users.models.User;

public abstract class AbstractNotifier {
    public abstract void notifyUser(User user, String message); 
}
