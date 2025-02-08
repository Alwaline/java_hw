public class SimpleHashTable<K, V> implements Table<K, V> {

    private final int MAX_CAPACITY = 10;

    private V[] table;

    private int size;

    public SimpleHashTable() {
        table = (V[]) new Object[MAX_CAPACITY];
    }

    @Override
    public void put(K key, V value) {
        // O(1)
        int hashCode = key.hashCode(); // Получаем число в диапазоне от -2^31 ... 2^31 - 1
        // Нам необходимо из хеш-кода получить число от 0 до 9
        int index = Math.abs(hashCode % MAX_CAPACITY);
        System.out.println("INFO " + key + " " + hashCode + " " + index);
        // кладем элемент в таблицу
        table[index] = value;
        size++;
    }

    @Override
    public V get(K key) {
        // O(1)
        int hashCode = key.hashCode(); // Получаем число в диапазоне от -2^31 ... 2^31 - 1
        // Нам необходимо из хеш-кода получить число от 0 до 9
        int index = Math.abs(hashCode % MAX_CAPACITY);

        return table[index];
    }
}
