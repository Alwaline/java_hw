package example04;

/**
 * Lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main3 {
    public static void main(String[] args) {
//        String a = "a";
//
//        for (int i = 0; i <= 1000; i++) {
//            a = a + "a";
//        }

        StringBuilder builder = new StringBuilder();
        builder.append("a");

        for (int i = 0; i < 1000; i++) {
            builder.append("a");
        }

        String a = builder.toString();
        System.out.println(a);
    }
}
