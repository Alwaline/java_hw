package ru.itis.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itis.spring.config.ApplicationConfig;
import ru.itis.spring.users.service.UserService;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.signIn("sidikov", "qwerty11");
    }
}
