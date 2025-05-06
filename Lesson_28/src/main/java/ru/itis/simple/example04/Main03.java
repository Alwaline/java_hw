package ru.itis.simple.example04;

import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) {
        int[] array = {445, 213, 5, 15, 1024};

        NumbersProcessor processor = new NumbersProcessor();

        NumbersProcessFunction oddNumbersFunction = a -> {
            if (a % 2 != 0) {
                return a;
            }
            return 0;
        };




        int[] result1 = processor.process(array, oddNumbersFunction);

        System.out.println(Arrays.toString(result1));
    }
}
