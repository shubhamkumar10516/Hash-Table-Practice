package com.bridgelab.linkedListPractice;

public class MyHashMap<K, V> {

	MyLinkedList<K> myLinkedList;
    public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

    // Getting value for key
	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	// Adding value to key in hash table
	public void add(K word, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(word);;
		if(myMapNode == null) {
			  myMapNode = new MyMapNode<K, V>(word, value);
	          this.myLinkedList.append(myMapNode);
		}
		else
			myMapNode.setValue(value);
	}
	
}
