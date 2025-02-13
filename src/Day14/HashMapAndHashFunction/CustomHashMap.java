package Day14.HashMapAndHashFunction;
import java.util.LinkedList;
class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;
    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
class CustomHashMap<K, V> {
    private LinkedList<Node<K, V>>[] buckets;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 16;
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        this.capacity = DEFAULT_CAPACITY;
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    private int getBucketIndex(K key) {
        return key.hashCode() % capacity;
    }
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[bucketIndex];
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        Node<K, V> newNode = new Node<>(key, value);
        bucket.add(newNode);
    }
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[bucketIndex];
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }
    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[bucketIndex];
        Node<K, V> toRemove = null;
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                toRemove = node;
                break;
            }
        }
        if (toRemove != null) {
            bucket.remove(toRemove);
        }
    }
    public boolean containsKey(K key) {
        return get(key) != null;
    }
    public static void main(String[] args) {
        CustomHashMap<String, Integer> hashMap = new CustomHashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("Value for 'One': " + hashMap.get("One"));
        System.out.println("Value for 'Two': " + hashMap.get("Two"));
        System.out.println("Value for 'Three': " + hashMap.get("Three"));
        hashMap.remove("Two");
        System.out.println("Value for 'Two' after removal: " + hashMap.get("Two"));
    }
}

