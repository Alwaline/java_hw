package example6;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(1); //index 0
        arr.add(2); //index 1
        arr.add(3); //index 2
        arr.add(4); //index 3
        arr.add(42); //index 4
        arr.add(6); //index 5
        arr.add(7); //index 6
        arr.add(8); //index 7
        arr.add(9); //index 8
        arr.add(10); //index 9
        arr.add(11); //index 10
        System.out.println(arr.length());
        System.out.println(arr.get(4));

        arr.remove(4);

        System.out.println(arr.get(4));
        System.out.println(arr.length());
    }
}
