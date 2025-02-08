public interface Table<K, V> {
    void put(K key, V value);

    V get(K key);
}
