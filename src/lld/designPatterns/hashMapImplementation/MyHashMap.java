package lld.designPatterns.hashMapImplementation;

import java.security.Key;

public class MyHashMap<K,V>{
    private static final int INITIAL_SIZE = 1<<4;
    private static final int MAX_CAPACITY = 1<<30;

    public Entry hashTable[];
    public MyHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }
    public MyHashMap(int capacity){
        int tableSize = tableSizeForCapcity(capacity);
        hashTable = new Entry[tableSize];
    }

    private int tableSizeForCapcity(int capacity) {
        // we have to find a no. that is greater than capacity and is of power 2
        int n = capacity-1; // so that most significant bit is 0
        n |= n>>>1; // all made 1 ( 1000 was no. in binary, you made 0111, and then added 1)
        n |= n>>>2; // 1011 -> 1010 -> 1111 -> +1 gives 10000
        n |= n>>>4;
        n |= n>>>8;
        n |= n>>>16;
        return (n<0) ? 1 : (n>=MAX_CAPACITY)?MAX_CAPACITY:n+1;

    }

    public V get(K key) {
        int hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];
        while(node!=null){
            if(node.key==key){
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry entry = hashTable[hashCode];
        if(entry==null){
            Entry newEntry = new Entry(key,value);
            hashTable[hashCode]=newEntry;
        }
        else{
            Entry prev = new Entry<>(key,value);
            while (entry!=null){
                if(entry.key==key){
                    entry.value = value;
                    return;
                }
                prev = entry;
                entry = entry.next;
            }
            Entry newNode = new Entry(key,value);
            prev.next = newNode;
        }
    }


    class Entry<K,V>{
        private K key;
        private V value;
        private Entry next;
        Entry(K k, V v){
            this.key = k;
            this.value = v;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }
}
