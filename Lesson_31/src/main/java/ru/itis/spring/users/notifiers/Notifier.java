package ru.itis.spring.users.notifiers;

import ru.itis.spring.users.data.ContactData;

public interface Notifier {
    void notify(ContactData data, String message);
}
