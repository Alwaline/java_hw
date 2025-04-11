package classwork;
import java.io.*;

public class Main7 {
    public static void main(String[] args) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("input.txt"))){
            
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
