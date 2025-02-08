public class HashSet<E> implements Set<E> {

    private final HashTable<E, Object> hashTable = new HashTable<>();

    @Override
    public void put(E e) {
        hashTable.put(e, new Object());
    }

    @Override
    public boolean contains(E e) {
        Object result = hashTable.get(e);
        return result != null;
    }
}
