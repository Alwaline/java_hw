package homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        String filename = "Lesson_23/src/homework/output.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true))) {
            String text = "\nЗадание 3: Hellow ворлд3!";
            bufferedWriter.write(text);
            bufferedWriter.newLine(); //угар, просто писал Writer bufferedWriter = new BufferedWriter(...)
        } catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }
}
