package ru.itis.users.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int size = scanner.nextInt();
            int[] array;

            if (size > 0) {
                array = new int[size];
            } else {
                array = new int[Integer.MAX_VALUE];
            }


            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a / b;

            array[1] = c;
            
            System.out.println(array[1]);
        } catch (InputMismatchException e) {
            System.out.println("Плохой ввод");
        } catch (RuntimeException e) {
            System.out.println("Получили какую-то ошибку");
        }
    }
}
