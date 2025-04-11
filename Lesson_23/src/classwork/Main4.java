package classwork;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main4 {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("Lesson_23/src/classwork/input.txt")){
            int c1 = reader.read();
            int c2 = reader.read();
            int c3 = reader.read();
            int c4 = reader.read();
            int c5 = reader.read();

            System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
