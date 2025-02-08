package example6;

/**
 * Lesson_7
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MyArrayList<T> {

    private static final int MAX_SIZE = 10;
    private T[] elements; // массив для хранения элементов
    private int count;

    public MyArrayList() {
        this.elements = (T[])new Object[MAX_SIZE];
    }

    public void add(T element) {
        if (this.count < this.elements.length) {
            this.elements[this.count] = element;
            this.count++;
        } else {
            T[] temp = (T[])new Object[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                temp[i] = this.elements[i];
            }
            this.elements = temp;
            this.elements[this.count] = element;
            this.count++;

        }
    }

    public void remove(int index) {
        for (int i = index; i < this.elements.length-1; i++) {
            if (i == index) {
                this.elements[i] = null;
                this.count--;
            }
            this.elements[i] = this.elements[i+1]; 
        }
    }

    public T get(int index) {
        return this.elements[index];
    }

    public int length() {
        return this.count;
    }
}
