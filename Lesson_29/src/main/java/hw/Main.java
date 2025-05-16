package hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        try (BufferedReader reader = new BufferedReader(new FileReader("hw_input.txt"))) {
            
            System.out.println("1 задание:");
            reader.lines()
                .map(line -> {
                    String[] parts = line.split("\\|");

                    return new Car(parts[0].strip(), parts[1].strip(), parts[2].strip(), Integer.parseInt(parts[3].strip()), Integer.parseInt(parts[4].strip()));
                })
                .filter(car -> {
                    return car.getColor().equals("Черный") || car.getOdometer() == 0;
                })
                .forEach(System.out::println);

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("hw_input.txt"))) {

            System.out.println("2 задание:");
            reader.lines()
                .map(line -> {
                    String[] parts = line.split("\\|");

                    return new Car(parts[0].strip(), parts[1].strip(), parts[2].strip(), Integer.parseInt(parts[3].strip()), Integer.parseInt(parts[4].strip()));
                })
                .filter(car -> {
                    return 700000 <= car.getCost() && car.getCost() <= 800000;
                })
                .map(car -> {
                    return car.getModel();
                })
                .distinct()
                .forEach(System.out::println);

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("hw_input.txt"))) {

            System.out.println("3 задание:");
            reader.lines()
                .map(line -> {
                    String[] parts = line.split("\\|");

                    return new Car(parts[0].strip(), parts[1].strip(), parts[2].strip(), Integer.parseInt(parts[3].strip()), Integer.parseInt(parts[4].strip()));
                })
                .min((car1, car2) -> {
                    return car1.getCost().compareTo(car2.getCost());
                })
                .map(car -> {
                    return car.getColor();
                })
                .ifPresent(System.out::println);

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("hw_input.txt"))) {

            System.out.println("4 задание:");
            reader.lines()
                .map(line -> {
                    String[] parts = line.split("\\|");

                    return new Car(parts[0].strip(), parts[1].strip(), parts[2].strip(), Integer.parseInt(parts[3].strip()), Integer.parseInt(parts[4].strip()));
                })
                .filter(car -> {
                    return car.getModel().contains("Camry");
                })
                .mapToInt(car -> car.getCost())
                .average()
                .ifPresentOrElse(System.out::println, null);

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        
    }
}


