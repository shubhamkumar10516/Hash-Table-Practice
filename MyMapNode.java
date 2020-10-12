package com.bridgelab.linkedListPractice;

public class MyMapNode<K, V> implements INode<K>{

	K key;
	V value;
	MyMapNode<K, V> next;
	
	public MyMapNode(K key, V value) {
         this.key = key;
         this.value = value;
         next = null;
	}
	
	public K getData() {
		return key;
    }
	public void setData(K key) {
       this.key = key;
    }
	@Override
	public INode<K> getNext() {
		
		return next;
	}
	
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public void setNext(INode<K> myNode) {
		this.next = (MyMapNode<K,V>)myNode;
	}
	@Override
	public String toString() {
		StringBuilder myMpaNodesString = new StringBuilder();
		myMpaNodesString.append("My map node{"+key).append(" V ="+value);
		if(next != null) {
			myMpaNodesString.append("->").append(next);
		}
		return myMpaNodesString.toString();
	}

}
