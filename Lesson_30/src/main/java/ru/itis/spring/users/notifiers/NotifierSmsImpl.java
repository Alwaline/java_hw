package ru.itis.spring.users.notifiers;

import ru.itis.spring.users.data.ContactData;

public class NotifierSmsImpl implements Notifier {

    private String smsServer;

    @Override
    public void notify(ContactData data, String message) {
        if (smsServer != null) {
            System.out.println("Отправляем сообщение через " + smsServer + " на телефон " +
                    data.getPhone() + " с текстом " + message);
        } else {
            throw new IllegalStateException("SMS-шлюз не настроен");

        }
    }

    public void setSmsServer(String smsServer) {
        this.smsServer = smsServer;
    }
}
