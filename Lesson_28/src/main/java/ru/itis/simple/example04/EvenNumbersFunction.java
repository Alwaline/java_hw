package ru.itis.simple.example04;

public class EvenNumbersFunction implements NumbersProcessFunction {

    @Override
    public int process(int number) {
        if (number % 2 == 0) {
            return number;
        }
        return 0;
    }
}
