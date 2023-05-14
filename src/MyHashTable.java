package src;
/**
 * Implementation of a hash table using separate chaining.
 *
 * @param <K> the type of keys stored in the hash table
 * @param <V> the type of values stored in the hash table
 */

public class MyHashTable<K, V> {
    private class HashNode<K,V>{
        private K key;
        private V value;
        private HashNode<K,V> next;
        public  HashNode(K key, V value){
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString(){
            return "{" + key + " " + value + "}";
        }
    }
    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    /**
     * Constructs a hash table with the default size.
     */

    public MyHashTable() {
        this.chainArray = new HashNode[M];
    }

    /**
     * Constructs a hash table with the specified size.
     *
     * @param M the size of the hash table
     */
    public MyHashTable(int M) {
        this.M = M;
        this.chainArray = new HashNode[M];
    }

    /**
     * Calculates the hash code for a given key.
     *
     * @param key the key to calculate the hash code for
     * @return the hash code
     */
    private int hash(K key){
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode) % M;
        return index;
    }

    /**
     * Inserts a key-value pair into the hash table.
     *
     * @param key   the key to be inserted
     * @param value the value associated with the key
     */
    public void put(K key, V value){
        int index = hash(key);
        HashNode<K,V> node = chainArray[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        node = new HashNode<>(key, value);
        node.next = chainArray[index];
        chainArray[index] = node;
        size++;
    }

    /**
     * Retrieves the value associated with a given key from the hash table.
     *
     * @param key the key to search for
     * @return the value associated with the key, or null if the key is not found
     */
    public V get(K key){
        int index = hash(key);
        HashNode<K,V> node = chainArray[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    /**
     * Removes a key-value pair from the hash table based on the given key.
     *
     * @param key the key to remove
     * @return the value associated with the removed key, or null if the key is not found
     */
    public V remove(K key){
        int index = hash(key);
        HashNode<K,V> node = chainArray[index];
        HashNode<K,V> prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    chainArray[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return node.value;
            }
            prev = node;
            node = node.next;
        }
        return null;
    }

    /**
     * Checks if the hash table contains a specific value.
     *
     * @param value the value to search for
     * @return true if the value is found, false otherwise
     */
    public boolean contains(V value){
        for (int i = 0; i < M; i++) {
            HashNode<K,V> node = chainArray[i];
            while (node != null) {
                if (node.value.equals(value)) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }
    /**
     * Retrieves the key associated with a given value from the hash table.
     *
     * @param value the value to search for
     * @return the key associated with the value, or null if the value is not found
     */
    public K getKey(V value){
        for (int i = 0; i < M; i++) {
            HashNode<K,V> node = chainArray[i];
            while (node != null) {
                if (node.value.equals(value)) {
                    return node.key;
                }
                node = node.next;
            }
        }
        return null;
    }

    /**
     * Prints the size of each bucket in the hash table.
     */
    public void printBucketSizes(){
        int[] sizes = new int[M];
        for (int i = 0; i < M; i++) {
            HashNode<K,V> node = chainArray[i];
            while (node != null) {
                sizes[i]++;
                node = node.next;
            }
        }
        for (int i = 0; i < M; i++) {
            System.out.println("Bucket " + i + ": " + sizes[i]);
        }
    }

}