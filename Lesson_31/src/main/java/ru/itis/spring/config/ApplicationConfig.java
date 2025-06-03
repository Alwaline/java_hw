package ru.itis.spring.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.ClassPathResource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import ru.itis.spring.users.notifiers.Notifier;
import ru.itis.spring.users.notifiers.NotifierEmailImpl;
import ru.itis.spring.users.notifiers.NotifierPushImpl;
import ru.itis.spring.users.notifiers.NotifierSmsImpl;
import ru.itis.spring.users.repository.UsersRepository;
import ru.itis.spring.users.repository.UsersRepositoryFileImpl;
import ru.itis.spring.users.repository.UsersRepositoryJdbcImpl;
import ru.itis.spring.users.service.UserService;

@Configuration

@PropertySource(value = "classpath:application.properties")
public class ApplicationConfig {

    @Bean
    public Notifier notifierPush() {
        return new NotifierPushImpl();
    }

    @Bean
    public Notifier notifierEmail(@Value("${email.smtp.server}") String smtpServer) {
        NotifierEmailImpl notifierEmail = new NotifierEmailImpl();
        notifierEmail.setSmtpServer(smtpServer);
        return notifierEmail;
    }

    @Bean
    public Notifier notifierSms(@Value("${sms.server}") String smsServer) {
        NotifierSmsImpl notifierSms = new NotifierSmsImpl();
        notifierSms.setSmsServer(smsServer);
        return notifierSms;
    }

    @Bean
    public UsersRepository usersRepositoryFile(@Value("${users.file.path}") String usersFilePath) {
        return new UsersRepositoryFileImpl(usersFilePath);
    }

    @Bean
    public UserService userService(@Qualifier("notifierSms") Notifier notifier, @Qualifier("usersRepositoryJdbc") UsersRepository usersRepository) {
        return new UserService(usersRepository, notifier);
    }

    @Bean
    public UsersRepository usersRepositoryJdbc(DataSource dataSource) {
        return new UsersRepositoryJdbcImpl(dataSource);
    }

    @Bean
    public HikariConfig hikariConfig() {
        Properties properties = new Properties();
        
        try {
            properties.load(new ClassPathResource("db.properties").getInputStream()); // Как это загружать нормально, я не понял
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        
        return new HikariConfig(properties);
    }

    @Bean
    public HikariDataSource hikariDataSource(HikariConfig config) {
        return new HikariDataSource(config);
    }
}
