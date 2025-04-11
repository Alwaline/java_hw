package classwork;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main6 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))){
            String line = bufferedReader.readLine();

            System.out.println(line);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
