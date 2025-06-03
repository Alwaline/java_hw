package ru.itis.spring.users.notifiers;

import ru.itis.spring.users.data.ContactData;

public class NotifierEmailImpl implements Notifier {

    private String smtpServer;

    @Override
    public void notify(ContactData data, String message) {
        if (smtpServer != null) {
            System.out.println("Отправляем сообщение через " + smtpServer + " на почту " +
                    data.getEmail() + " с текстом " + message);
        } else {
            throw new IllegalStateException("SMTP не настроен");
        }
    }

    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }
}
