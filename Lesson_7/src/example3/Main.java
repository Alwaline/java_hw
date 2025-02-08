package example3;

/**
 * Lesson_7
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        IPhone iPhone = new IPhone();

        Cover<IPhone> coverForIPhone = new Cover<>(iPhone);
        Cover<Nokia> coverForNokia = new Cover<>(nokia);

        IPhone iPhone1 = coverForIPhone.getPhone();
        Nokia nokia1 = coverForNokia.getPhone();

        iPhone1.photo();
        nokia1.call();
    }
}
