import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human [100];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            humans[i] = new Human("user" + (i+1), rand.nextInt(100));
        }

        int ages[] = new int[101];

        for (int i = 0; i < humans.length; i++) {
            ages[humans[i].age] += 1;
        }
        
        int maxAge = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= ages[maxAge]) {
                maxAge = i;
            }
        }
        
        System.out.println(maxAge);

    }
}
