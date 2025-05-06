package ru.itis.simple.example04;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        int[] array = {445, 213, 5, 15, 1024};

        NumbersProcessor processor = new NumbersProcessor();

        EvenNumbersFunction evenNumbersFunction = new EvenNumbersFunction();

        int[] result1 = processor.process(array, evenNumbersFunction);

        System.out.println(Arrays.toString(result1));
    }
}
