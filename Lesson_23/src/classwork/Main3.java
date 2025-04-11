package classwork;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("input.txt")) {
            byte[] buffer = new byte[1024];
            int length = input.read(buffer);

            System.out.println(Arrays.toString(buffer));

            System.out.println(length);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
