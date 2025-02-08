package example01;

public class MyLinkedList<E> implements MyList<E> {

    private static class Node<T> {

        T value;

        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<E> head;

    private Node<E> tail;

    private int size;

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);

        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }

        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public void remove(E element) {

    }

    @Override
    public int indexOf(E element) {
        return 0;
    }
}