package ru.itis.users.app;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("users.txt", true);
            fileWriter.write("hello!\n");
            fileWriter.write("bye!\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Не получилось поработать с файлом");
        }
    }
}
