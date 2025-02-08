package example01;

/**
 * Lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Human h = new Human(27);
        Human h2;

        h2 = h;

        h2.setAge(33);

        System.out.println(h.getAge());

        System.out.println(h2 == h);
    }
}
