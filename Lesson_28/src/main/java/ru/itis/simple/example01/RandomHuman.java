package ru.itis.simple.example01;

import java.util.Random;

public class RandomHuman extends Human {
    private Random rand = new Random();

    private int randomNumber;

    public RandomHuman(String name, int age) {
        super(name, age);
    }

    @Override
    public void go() {
        randomNumber = rand.nextInt(100);
        System.out.println("Я " + name + " " + age + " " + randomNumber);
    }
}
