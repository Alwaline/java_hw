package example02;

/**
 * Lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Human {
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void go() {
        System.out.println("Я человек и иду пешком");
    }
}
