package example2;

/**
 * Lesson_7
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        IPhone iPhone = new IPhone();

        CoverForObject coverForIPhone = new CoverForObject(nokia);
        CoverForObject coverForNokia = new CoverForObject(iPhone);

        IPhone iPhone1 = (IPhone) coverForIPhone.getPhone();
        Nokia nokia1 = (Nokia) coverForNokia.getPhone();

        iPhone1.photo();
        nokia1.call();
    }
}
