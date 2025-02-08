public class SimpleTable<K, V> implements Table<K, V> {
    private Pair<K, V>[] table;

    private int size;

    public SimpleTable() {
        this.table = new Pair[10];
        this.size = 0;
    }

    @Override
    public void put(K key, V value) {
        if (size == table.length) {
            System.err.println("Table is full");
        } else {
            for (int i = 0; i < size; i++) {
                if (table[i].getKey().equals(key)) {
                    table[i].setValue(value);
                    return;
                }
            }
            Pair<K, V> newPair = new Pair<>(key, value);
            table[size] = newPair;
            size++;
        }
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (table[i].getKey().equals(key)) {
                return table[i].getValue();
            }
        }
        return null;
    }


}
