package classwork;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("input.txt")) {
            int b = input.read();
            int b1 = input.read();
            int b2 = input.read();
            int b3 = input.read();

            System.out.println(b + " " + b1 + " " + b2 + " " + b3);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
