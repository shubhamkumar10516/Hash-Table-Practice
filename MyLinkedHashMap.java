package com.bridgelab.linkedListPractice;

import java.util.*;

public class MyLinkedHashMap<K, V> {

	private final int numBuckets;
	List<MyLinkedList<K>> myBucketArray;
    
	public MyLinkedHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<MyLinkedList<K>>();
		for(int i = 0 ; i < numBuckets; i++)
			myBucketArray.add(null);
	}
	
	//implementing hash function to find index for key
	public int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		return hashCode%numBuckets;
	}
	
	// finding value for key:
	public V get(K key) {
		int index = getBucketIndex(key);
		MyLinkedList<K> myLinkedList = myBucketArray.get(index);
		if(myLinkedList == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}
	
	//adding key and value
	public void add(K key, V value) {
		int index = getBucketIndex(key);
		MyLinkedList<K> myLinkedList = myBucketArray.get(index);
		if(myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<K, V>(key, value);
			myLinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}
}
