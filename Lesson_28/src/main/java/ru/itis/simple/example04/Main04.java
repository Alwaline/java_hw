package ru.itis.simple.example04;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        int[] array = {445, 213, 5, 15, 1024};

        NumbersProcessor processor = new NumbersProcessor();

        int[] result1 = processor.process(array, a -> {
            if (a % 2 != 0) {
                return a;
            }
            return 0;
        });

        int[] result2 = processor.process(array, b -> {
            if (b % 10 == 5) {
                return -1;
            } else {
                return 2;
            }
        });

        System.out.println(Arrays.toString(result2));
    }
}
