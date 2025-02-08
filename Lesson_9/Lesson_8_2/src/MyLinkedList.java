public class MyLinkedList<E> implements MyList<E> {

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
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        if (index > size || index < 0) {
            new IndexOutOfBoundsException();
        }
        
        Node<E> node = head;

        int i = 0;
        while (i < index) {
            node = node.getNext();
            i++;
        }
        return node.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void removeAt(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        
        if (index == 0 && size == 1){
            head = null;
            tail = null;
        } else if (index == 0) {
            head = head.getNext();
        } else {

            Node<E> node = head;

            int i = 0;
            while (i < index-1) {
                node = node.getNext();
                i++;
            }
            node.setNext(node.getNext());
            if (index == size-1) {
                tail = node;
            }
        }
        size--;

    }

    @Override
    public void remove(E element) {
        int index = indexOf(element);
        if (index >= 0){
            removeAt(index);
        }
    }

    @Override
    public int indexOf(E element) {
        Node<E> node = head;
        for (int i = 0; i < size; i++) {
            if (node.getValue().equals(element)) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }
}