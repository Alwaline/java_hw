package example02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("python");
        words.add("Bye");
        words.add("java");
        words.add("Marsel");

        words.stream()
                .filter(word -> Character.isUpperCase(word.toCharArray()[0]))
                .map(word -> {
                    char[] array = word.toCharArray();

                    for (int i = 0; i < array.length / 2; i++) {
                        char temp = array[i];
                        array[i] = array[array.length - i - 1];
                        array[array.length - i - 1] = temp;
                    }

                    return new String(array);
                })
                .forEach(word -> System.out.println("Слово - " + word));
    }
}
