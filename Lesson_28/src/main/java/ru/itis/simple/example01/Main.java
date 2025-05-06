package ru.itis.simple.example01;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Marsel", 20) {
            private Random rand = new Random();

            private int randomNumber;

            @Override
            public void go() {
                randomNumber = rand.nextInt(100);
                System.out.println("Я " + name + " " + age + " " + randomNumber);
            }
        };

        human.go();

        RandomHuman randomHuman = new RandomHuman("RH", 20);
        RandomHuman randomHuman2 = new RandomHuman("RH2", 30);
    }
}
