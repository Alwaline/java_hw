public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private E[] elements;

    private int count;

    public MyArrayList() {
        this.elements = (E[])new Object[DEFAULT_CAPACITY];
        this.count = 0;
    }

    @Override
    public void add(E element) {
        ensureCapacity();
        this.elements[count] = element;
        count++;
    }

    private void ensureCapacity() {
        if (isFull()) {
            resize();
        }
    }

    private boolean isFull() {
        return count == elements.length;
    }

    private void resize() {
        E[] newElements = (E[])new Object[elements.length + elements.length / 2]; // создаем массив, который в полтора раза больше, чем предыдущий
        // нужно в новый массив скопировать все из предыдущего
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return this.elements[index];
    }

    private void checkIndex(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isOutOfBounds(int index) {
        return index < 0 || index >= count;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void removeAt(int index) {
        count--;
        for (int i = index; i < count; i++) {
            elements[i] = elements[i+1];
        }
    }

    @Override
    public void remove(E element) {
        int index = indexOf(element);
        removeAt(index);
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


}
