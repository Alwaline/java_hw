import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Marsel");
        words.add("Maxim");
        words.set(0, "Vlad");
        words.add(0, "Ilshat");
        

        System.out.println(words);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.set(0, 4);
        list.add(0, 3);
        System.out.println(list.get(0));

        System.out.println(list);
    }
}
