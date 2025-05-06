package ru.itis.simple.example04;

import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) {
        int[] array = {445, 213, 5, 15, 1024};

        NumbersProcessor processor = new NumbersProcessor();

        NumbersProcessFunction oddNumbersFunction = new NumbersProcessFunction() {
            @Override
            public int process(int number) {
                if (number % 2 != 0) {
                    return number;
                }
                return 0;
            }
        };

        int[] result1 = processor.process(array, oddNumbersFunction);

        System.out.println(Arrays.toString(result1));
    }
}
