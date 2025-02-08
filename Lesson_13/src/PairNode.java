public class PairNode<K, V> {
    K key;
    V value;
    PairNode<K, V> next;
    int hashCode;

    public PairNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

    public PairNode<K,V> getNext() {
        return next;
    }

    public void setNext(PairNode<K,V> next) {
        this.next = next;
    }

    public K getKey() {return key;}
    public V getValue() {return value;}

    public void setKey(K key) {this.key = key;}
    public void setValue(V value) {this.value = value;}
}
