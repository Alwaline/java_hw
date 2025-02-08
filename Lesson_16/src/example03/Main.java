package example03;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list1 = new MyArrayList<>();
        MyArrayList<String> list2 = new MyArrayList<>();

        list1.add("Hello");
        list1.add("My");
        list1.add("Friend");

        list2.add("Java");
        list2.add("C++");
        list2.add("Python");

//        MyArrayList.MyArrayListIterator iterator1 = list1.new MyArrayListIterator();
//        MyArrayList.MyArrayListIterator iterator2 = list2.new MyArrayListIterator();

        Iterator<String> iterator1 = list1.iterator();
        Iterator<String> iterator2 = list2.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
