public class Main1 {
    public static void main(String[] args) {
        Human a = new Human(30);
        Human b = new Human(25);
        a.printAge();
        b.printAge();

        a.humansCount = 35;

        System.out.println(b.humansCount);

        b.humansCount = 77;

        System.out.println(a.humansCount);
    }
}
