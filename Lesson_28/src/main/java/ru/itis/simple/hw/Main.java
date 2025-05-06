package ru.itis.simple.hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] array = {445, 6, 37, 42, 1240};

        NumbersProcessor processor = new NumbersProcessor();

        int[] result = processor.process(array, number -> {
            
            int sum = 0;
            
            int div;
            int mod;
            do {
                div = number / 10;
                mod = number % 10;
                
                sum += mod;
                number = div;
                
            } while (div != 0);
         
            return sum;
        });

        System.out.println(Arrays.toString(result));
    }
}
