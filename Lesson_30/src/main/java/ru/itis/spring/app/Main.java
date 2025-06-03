package ru.itis.spring.app;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import ru.itis.spring.users.notifiers.Notifier;
import ru.itis.spring.users.notifiers.NotifierEmailImpl;
import ru.itis.spring.users.notifiers.NotifierPushImpl;
import ru.itis.spring.users.notifiers.NotifierSmsImpl;
import ru.itis.spring.users.repository.UsersRepositoryFileImpl;
import ru.itis.spring.users.repository.UsersRepositoryJdbcImpl;
import ru.itis.spring.users.service.UserService;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        NotifierEmailImpl emailNotifier = new NotifierEmailImpl();
        emailNotifier.setSmtpServer("smtp.gmail.com");

        NotifierSmsImpl smsNotifier = new NotifierSmsImpl();
        smsNotifier.setSmsServer("SMS Aero");

        NotifierPushImpl notifierPush = new NotifierPushImpl();

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/shop_db");
        config.setUsername("postgres");
        config.setPassword("qwerty007");
        DataSource dataSource = new HikariDataSource(config);

        UsersRepositoryFileImpl usersRepositoryFile = new UsersRepositoryFileImpl("users.txt");
        UsersRepositoryJdbcImpl usersRepositoryJdbc = new UsersRepositoryJdbcImpl(dataSource);

        UserService service = new UserService(usersRepositoryJdbc, smsNotifier);

        service.signIn("sidikov", "qwerty11");


    }
}
