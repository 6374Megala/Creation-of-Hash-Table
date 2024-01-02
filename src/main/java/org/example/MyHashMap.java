package org.example;

public class MyHashMap <K,V>{
    MyLinkedList<K> myLinkedList;

    public MyHashMap() {
        this.myLinkedList = new MyLinkedList();
    }

    public V get(K key) {
        MyMapNode<K, V> mymapnode = (MyMapNode<K, V>) this.myLinkedList.searchKey(key);
        return (mymapnode == null) ? null : mymapnode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> mymapnode = (MyMapNode<K, V>) this.myLinkedList.searchKey(key);
        if (mymapnode == null) {
            mymapnode = new MyMapNode<>(key, value);
            this.myLinkedList.append(mymapnode);
        } else {
            mymapnode.setValue(value);
        }
    }
    public Integer size(){
       return myLinkedList.size();
    }

    public String toString(){
        return "MyHashMapNodes{ "+myLinkedList+'}';
    }
}
