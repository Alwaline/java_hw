package example01;

import java.util.function.Function;

public class ReverseWordFunction implements Function<String, String> {

    @Override
    public String apply(String o) {
        char[] array = o.toCharArray();

        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return new String(array);
    }
}
