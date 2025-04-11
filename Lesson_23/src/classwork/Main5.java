package classwork;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main5 {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("input.txt")){
            char[] buffer = new char[100];
            int length = reader.read(buffer);

            String string = new String(buffer, 0, length);

            System.out.println(string);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
