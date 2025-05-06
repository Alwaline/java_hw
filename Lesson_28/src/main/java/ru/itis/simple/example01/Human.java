package ru.itis.simple.example01;

public class Human {

    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void go() {
        System.out.println("Человек пошел!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
