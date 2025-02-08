public class HashTable<K, V> implements Table<K, V> {

    private final int MAX_CAPACITY = 10;

    private PairNode<K, V>[] table;

    private int size;

    public HashTable() {
        table = new PairNode[MAX_CAPACITY];
    }

    @Override
    public void put(K key, V value) {
        // O(1)
        int hashCode = key.hashCode(); // Получаем число в диапазоне от -2^31 ... 2^31 - 1
        // Нам необходимо из хеш-кода получить число от 0 до 9
        int index = Math.abs(hashCode % MAX_CAPACITY);
        System.out.println("INFO " + key + " " + hashCode + " " + index);
        if (table[index] == null) { // если в этой ячейке еще ничего нет
            // создаем новую пару
            table[index] = new PairNode<>(key, value, hashCode);
        } else {
            // если там уже что-то было

            // а нет ли там уже такого ключа?
            PairNode<K, V> current = table[index];

            while (current != null) { // пока не прошли весь список
                if (current.key.hashCode() == hashCode && current.key.equals(key)) {
                    // если мы нашли такой ключ
                    current.value = value; // заменяем значение
                    return; // остановка работы метода
                }
                current = current.next; // переходим дальше
            }
            PairNode<K, V> newNode = new PairNode<>(key, value, hashCode); // создали новую пару
            newNode.setNext(table[index]); // следующий узел после текущего - это тот, который был раньше
            // новый узел - теперь первый
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
        
        if (table[index] != null) { 
            PairNode <K, V> current = table[index];
            while (current != null) {
                if (current.key.hashCode() == hashCode && current.key.equals(key)) {
                    return current.getValue();
                }
                current = current.getNext();
            } 
        }
        return null;
    }
}
