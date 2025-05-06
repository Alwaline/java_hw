package ru.itis.simple.example02;

public class Main {
    public static void main(String[] args) {
        Button signUpButton = new Button(10, 20, "Регистрация") {
            @Override
            public void onClick() {
                System.out.println("Выполняется регистрация. Сохраняем данные в базу");
            }
        };

        Button closeButton = new Button(20, 20, "Закрыть форму") {
            @Override
            public void onClick() {
                System.out.println("Закрываем форму...");
            }
        };

        signUpButton.click();
        closeButton.click();

    }
}
