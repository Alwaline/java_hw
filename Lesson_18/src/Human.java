import java.util.Random;

public class Human {

    static int humansCount;

    static {
        Random random = new Random();
        humansCount = random.nextInt(100);
    }

    int age;

    public Human(int age) {
        this.age = age;
    }

    public void printAge() {
        System.out.println(age);
    }

    public static void printHumansCount() {
        System.out.println(humansCount);
//        System.out.println(age);
//        printAge();
    }
}
