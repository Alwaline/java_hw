package ru.itis.simple.hw;

public class NumbersProcessor {

    public int[] process(int[] numbers, NumbersProcessFunction function) {
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = function.process(numbers[i]);
        }

        return result;
    }
}
