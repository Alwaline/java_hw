public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();

        for (int i = 0; i < 30; i++) {
            strings.add("Marsel");
        }

        MyArrayList<Human> humans = new MyArrayList<>();

        Human h1 = new Human(30, "Alex");
        Human h2 = new Human(25, "Andrey");
        Human h3 = new Human(19, "Vadim");

        humans.add(h1);
        humans.add(h2);
        humans.add(h3);

        System.out.println(humans.indexOf(h3));
        System.out.println(humans.get(0));

        humans.remove(h1);
        humans.removeAt(0);
        
        System.out.println(humans.get(0));
    }
}
