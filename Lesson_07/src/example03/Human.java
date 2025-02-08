package example03;

import java.util.Objects;

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
        // если нам закинули нулевую ссылку
        if (o == null) {
            return false;
        }
        // проверим, а не закинули ли один и тот же объект
        if (this == o) {
            return true;
        }
        // проверим, а не другого ли типа закинули нам объект
        if (this.getClass() != o.getClass()) {
            return false;
        }
        // мы убедились, что это разные объекты одного и того же класса, значит надо сравнивать поля
        // делаем нисходящее преобразование
        // теперь that указывает на второй объект
        Human that = (Human) o;
        return this.age == that.age && this.name.equals(that.name);
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;

        if (age != human.age) return false;
        return Objects.equals(name, human.name);
    }
     */
}
