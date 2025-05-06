package ru.itis.simple.example03;

public class Main {
    public static void main(String[] args) {
        Transport bus = new Transport() {
            @Override
            public void go() {
                System.out.println("Автобус поехал");
            }

            @Override
            public void stop() {
                System.out.println("Автобус остановился");
            }
        };

        Transport car = new Transport() {
            @Override
            public void go() {
                System.out.println("Машина поехала");
            }

            @Override
            public void stop() {
                System.out.println("Машина остановилась");
            }
        };

        bus.go();
        car.go();
    }
}
