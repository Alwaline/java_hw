package example02;

/**
 * Lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Runner extends Human {

    private String name;

    public Runner(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void go() {
        System.out.println("Я спортсмен и я бегу!");
    }
}
