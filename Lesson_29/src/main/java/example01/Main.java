package example01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("python");
        words.add("Bye");
        words.add("java");
        words.add("Marsel");

        Stream<String> wordsStream = words.stream();

        long count = wordsStream.count();

        System.out.println(count);

        WordStartsWithUpperPredicate wordStartsWithUpperPredicate = new WordStartsWithUpperPredicate();
        ReverseWordFunction reverseWordFunction = new ReverseWordFunction();
        PrintWordConsumer printWordConsumer = new PrintWordConsumer();

        Stream<String> upperWords = words.stream().filter(wordStartsWithUpperPredicate);
        Stream<String> reversedUpperWords = upperWords.map(reverseWordFunction);

        reversedUpperWords.forEach(printWordConsumer);
    }
}
