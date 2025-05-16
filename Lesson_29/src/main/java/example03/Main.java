package example03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            reader.lines()
                    .map(line -> {
                String[] parts = line.split("\\|");

                return new User(parts[0], Integer.parseInt(parts[1]), parts[2]);
            }).forEach(System.out::println);

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
