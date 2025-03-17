package example;

import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        ObjectsCounter counter = ObjectsCounter.getInstance();
        ObjectsCounter counter1 = ObjectsCounter.getInstance();
//        ObjectsCounter counter1 = new ObjectsCounter();

        Scanner scanner = new Scanner(System.in);
        counter.newObject();

        Random random = new Random();
        counter1.newObject();

        counter.printCount();
    }
}
