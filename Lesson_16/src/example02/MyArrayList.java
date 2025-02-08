package example02;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    public class MyArrayListIterator implements Iterator<E> {

        private int currentIndex = 0; // индекс текущей позиции итератора

        @Override
        public boolean hasNext() {
            return currentIndex < count; // пока не прошли все элементы
        }

        @Override
        public E next() {
            E element = elements[currentIndex]; // получаю текущий элемент
            currentIndex++; // перехожу к следующему
            return element; // возвращаю элемент
        }
    }

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

    }

    @Override
    public void remove(E element) {

    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("example02.MyArrayList[");

        for (int i = 0; i < count - 1; i++) {
            builder.append(elements[i]).append(",");
        }
        builder.append(elements[count - 1]).append("]");

        return builder.toString();
    }

    @Override
    public Iterator<E> iterator() {
//        return new MyArrayListIterator<>(this);
        return null;
    }
}
