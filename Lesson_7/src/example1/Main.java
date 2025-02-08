package example1;

/**
 * Lesson_7
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        IPhone iPhone = new IPhone();

        CoverForIPhone coverForIPhone = new CoverForIPhone(iPhone);
        CoverForNokia coverForNokia = new CoverForNokia(nokia);

        IPhone iPhone1 = coverForIPhone.getPhone();
        Nokia nokia1 = coverForNokia.getPhone();


    }
}
