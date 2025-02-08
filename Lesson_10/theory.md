# Java Collections

* `Collection<E>` - интерфейс, описывающий любой произвольный контейнер для объектов
  * `int size();` - количество элементов в коллекции
  * `boolean isEmpty();` - проверяет, не пустая ли коллекция
  * `boolean contains(Object o);` - проверяет, содержится ли элемент в коллекции
  * `Object[] toArray();` - преобразует коллекцию в массив объектов
  * `<T> T[] toArray(T[] a);` - преобразует коллекцию в массив объектов определенного типа (тип коллекций)
  * `boolean add(E e);` - добавляет элемент в коллекцию
  * `boolean remove(Object o);` - удаляет определенный элемент из коллекции
  * `void clear();` - очистка коллекции
* `List<T>` - интерфейс, описывающий список, в котором для каждого элемента предусмотрен порядковый номер
  * `E get(int index);` - получение элемента по индексу
  * `E set(int index, E element);` - заменяет элемент по индексу
  * `void add(int index, E element);` - добавляет элемент в заданную позицию со сдвигом вправо
  * `E remove(int index);` - удаляет элемент по индексу
  * `int indexOf(Object o);` - получает индекс элемента в списке
  * `int lastIndexOf(Object o);` - получает последний индекс элемента в списке, если такие элементы уже есть
  * `void addFirst(E e)` - добавить в начало
  * `void addLast(E e)` - добавить в конец
  * `E getFirst()` - получить первый
  * `E getLast()` получить последний
  * `E removeFirst()` - удалить первый
  * `E removeLast()` - удалить последний

* `ArrayList<E>` - коллекция + список, базирующиеся на массиве

```java
class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10; // размер массива по умолчанию
    
    Object[] elementData; // хранилище данных
    
    private int size; // количество элементов в массива
    
    public boolean add(E e) {
        add(e, elementData, size);
        return true;
    }
    
    // добавляет элемент e в массив elementData, при этом в массиве уже есть s-элементов
    private void add(E e, Object[] elementData, int s) {
        // если массив переполнен
        if (s == elementData.length)
            // увеличиваем массив
            elementData = grow();
        // добавляем элемент в конец
        elementData[s] = e;
        // увеличиваем количество элементов
        size = s + 1;
    }

    // возвращает увеличенную копию массива
    private Object[] grow() {
        return grow(size + 1);
    }

    // возвращает увеличенную копию основного массива с гарантией того, что в нем будет minCapacity ячеек
    private Object[] grow(int minCapacity) {
        // запоминаем старый размер
        int oldCapacity = elementData.length; 
        // если старый размер больше нуля, либо массив не пустой
        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            // вызываем метод для получения нового размера массива
            // он создает новый размер на основе:
            // - минимальное увеличение
            // - желательное увеличение
            // >> 1 - побитовый сдвиг вправо (половина от старого размера)
            int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            // создаем копию старого массива большего объема
            // под капотом вызывается нативный System.arraycopy
            // нативный - означает, что реализован на C/C++ и вшит в виртуальную машину
            return elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }
}
```

* Несмотря на то, что список на основе массива требует создания нового массива и копирования в него данных в случае переполнения
  * эта операция происходит очень быстро за счет использования нативной функции

* `LinkedList<E>` - коллекция + список, базирующиеся на двунаправленном связном списке

```java
class LinkedList<E> implements List<E> {
    int size = 0;

    Node<E> first;

    Node<E> last;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        // ...
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    // возвращает узел с необходимым индексом
    // ищет в половине, в которой находится индекс
    Node<E> node(int index) {

        if (index < (size >> 1)) { // если индекс меньше середины списка
            Node<E> x = first; // начинаем с начала
            for (int i = 0; i < index; i++) // до тех по пока не найдем индекс
                x = x.next; // переходим к следующему узлу
            return x; // возвращаем узел
        } else { // если индекс больше середины списка
            Node<E> x = last; // начинаем с конца
            for (int i = size - 1; i > index; i--) // до тех пор пока не найдем индекс
                x = x.prev; // переходим к предыдущему узлу
            return x;
        }
    }
}
```

## Домашняя работа

```
* Повторить теорию
* Сделать main, где вы вызываете все методы (которые я озвучил) списков LinkedList и ArrayList
```