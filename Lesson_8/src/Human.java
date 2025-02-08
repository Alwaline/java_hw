/**
 * Lesson_07
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void go() {
        System.out.println("Я человек и иду пешком");
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (this.getClass() != o.getClass()) {
            return false;
        }

        Human that = (Human) o;
        return this.name == that.name && this.age == that.age;
    }
  
}
