public class HashTable<K, V> implements Table<K, V> {

    private final int MAX_CAPACITY = 10;

    private PairNode<K, V>[] table;

    private int size;

    public HashTable() {
        table = new PairNode[MAX_CAPACITY];
    }

    @Override
    public void put(K key, V value) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % MAX_CAPACITY);
        if (table[index] == null) {
            table[index] = new PairNode<>(key, value, hashCode);
        } else {
            PairNode<K, V> current = table[index];

            while (current != null) {
                if (current.hashCode == hashCode && current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            PairNode<K, V> newNode = new PairNode<>(key, value, hashCode);
            newNode.setNext(table[index]);
            table[index] = newNode;
        }
        size++;
    }

    @Override
    public V get(K key) {
        // O(1)
        int hashCode = key.hashCode(); // Получаем число в диапазоне от -2^31 ... 2^31 - 1
        // Нам необходимо из хеш-кода получить число от 0 до 9
        int index = Math.abs(hashCode % MAX_CAPACITY);

        return null;
    }
}
