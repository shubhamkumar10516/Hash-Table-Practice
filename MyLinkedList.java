package com.bridgelab.linkedListPractice;

public class MyLinkedList<T>{
	
	public INode<T> head;
	public INode<T> tail;
	
	public void add(INode<T> newNode) {
		if(tail == null)
			tail =newNode;
		if(head == null)
			 head = newNode;
		else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	// appending node at end
		public void append(INode<T> myNode) {
			if (tail != null) {
				tail.setNext(myNode);
				tail = myNode;
			} else if (tail == null) {
				tail = myNode;
				head = myNode;
			}
		}
	public INode<T> pop(){
		INode<T> tempNode = head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public void printList() {
		INode<T> t = head;
		while(t != null ) {
		System.out.print(t.getData()+" -> ");
		t.setNext(t.getNext());
		}
		System.out.println("null");
	}
	
	// Searching node with value
		public INode<T> search(T val) {
			if (head == null)
				return head;
			INode<T> temp = head;
			while (temp != null) {
				if (temp.getData().equals(val))
					return temp;
				temp = temp.getNext();
			}
			return null;
		}
}


