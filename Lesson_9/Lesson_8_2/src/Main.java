public class Main {
    public static void main(String[] args) {
    //     Node<String> a = new Node<>("Привет");
    //     Node<String> b = new Node<>("Марсель");
    //     Node<String> c = new Node<>("Как дела");
    //     Node<String> d = new Node<>("Что нового");
    //     Node<String> e = new Node<>("Пока");

    //     a.setNext(b);
    //     b.setNext(c);
    //     c.setNext(d);
    //     d.setNext(e);

    //     Node<String> current = a;

    //     while (current != null) {
    //         System.out.println(current.getValue());
    //         current = current.getNext();
    //     }

    MyLinkedList<Integer> myArr = new MyLinkedList<>();
    myArr.add(1);
    myArr.add(2);
    myArr.add(3);
    myArr.add(4);

    System.out.println(myArr.size());
    myArr.remove(0);
    System.out.println(myArr.size());

    System.out.println(myArr.get(0));
    System.out.println(myArr.get(2));

    System.out.println(myArr.indexOf(1));
    System.out.println(myArr.indexOf(2));
    System.out.println(myArr.indexOf(3));
    System.out.println(myArr.indexOf(4));
    
    myArr.removeAt(0);
    System.out.println(myArr.get(0));
    System.out.println(myArr.get(2));
    System.out.println(myArr.size());

    myArr.removeAt(2);
    System.out.println(myArr.size());


    }
}
