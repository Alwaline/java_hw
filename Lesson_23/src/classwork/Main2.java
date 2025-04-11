package classwork;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main2 {
    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("input.txt")) {
            int b = input.read();

            while (b != -1) {
                System.out.println(b);
                b = input.read();
            }

        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
