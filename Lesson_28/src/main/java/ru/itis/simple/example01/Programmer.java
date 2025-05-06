package ru.itis.simple.example01;

public class Programmer extends Human {

    private int experience;

    public Programmer(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public void go() {
        System.out.println("Программист пошел!");
    }

    public int getExperience() {
        return experience;
    }
}
