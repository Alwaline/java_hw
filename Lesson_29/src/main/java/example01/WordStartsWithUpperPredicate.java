package example01;

import java.util.function.Predicate;

public class WordStartsWithUpperPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return Character.isUpperCase(s.toCharArray()[0]);
    }
}
