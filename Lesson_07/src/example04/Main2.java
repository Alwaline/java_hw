package example04;

/**
 * Lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        s1 = s1.intern();
        System.out.println(s1);

        String s2 = "Hello";

        System.out.println(s1 == s2);

    }
}
