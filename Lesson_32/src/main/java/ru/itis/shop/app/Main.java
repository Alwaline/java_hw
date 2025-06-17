package ru.itis.shop.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itis.shop.config.ApplicationConfig;
import ru.itis.shop.accounts.service.AccountsService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        AccountsService accountsService = context.getBean(AccountsService.class);

        accountsService.signUp("Marsel", "Sidikov", "sidikov@gmail.com", "qwerty007", 20);

        System.out.println(accountsService.getAllEmails());
    }
}
