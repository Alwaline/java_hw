package homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String filename = "Lesson_23/src/homework/output.txt";
        try (OutputStream outputStream = new FileOutputStream(filename)) {
            String text = "Задание 1: Hello ворлд!";
            byte[] buff = text.getBytes();
            System.out.println(Arrays.toString(buff));
            outputStream.write(buff);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }

    }
}
