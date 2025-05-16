package example01;

import java.util.function.Consumer;

public class PrintWordConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("Слово - " + s);
    }
}
