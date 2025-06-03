package ru.itis.spring.users.notifiers;

import ru.itis.spring.users.data.ContactData;

public class NotifierPushImpl implements Notifier {

    @Override
    public void notify(ContactData data, String message) {
        System.out.println("Отправляем сообщение через push-уведомление на устройство "
                + data.getPushId() + " с текстом " + message);
    }
}
