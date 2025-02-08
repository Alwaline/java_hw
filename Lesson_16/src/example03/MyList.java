package example03;

public interface MyList<T> extends Iterable<T> {
    void add(T element);

    T get(int index);

    int size();

    void removeAt(int index);

    void remove(T element);

    int indexOf(T element);
}
