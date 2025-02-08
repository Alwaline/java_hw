package example4;

/**
 * Lesson_7
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        int a = 5; // как это число превратить в Object?
        // за нас придумали классы-обертки
        Integer x = new Integer(5); // boxing, упаковка
        int y = x.intValue(); // unboxing, распаковка

        Integer z = 5; // autoboxing
        int d = z; // autounboxing

    }
}
