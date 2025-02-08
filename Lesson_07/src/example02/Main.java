package example02;

/**
 * Lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Human h;
        Runner r = new Runner(27, "Marsel");
        h = r;
        h.go();
        r.go();

    }
}
