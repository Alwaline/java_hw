package example03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human h1 = new Human(30, "Marsel"); // 7766
        Human h2 = new Human(30, "Marsel"); // 7788


        System.out.println(h1 == h2); // false
        System.out.println(h1.equals(h2)); // true
        System.out.println(h1.equals(scanner));

        Object o1 = scanner;
        Object o2 = h1;

        // System.out.println(x) -> x.toString()
        System.out.println(scanner);
        System.out.println(h1);
        System.out.println(h2);


    }
}
