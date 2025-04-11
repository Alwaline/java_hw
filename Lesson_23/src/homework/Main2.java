package homework;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String filename = "Lesson_23/src/homework/output.txt";
        try (FileWriter fileWriter = new FileWriter(filename, true)) {
            String text = "\nЗадание 2: Hellow ворлд2!";
            fileWriter.write(text);
        } catch (IOException e) {   
            throw new IllegalArgumentException(e);
        }
    } 
}
