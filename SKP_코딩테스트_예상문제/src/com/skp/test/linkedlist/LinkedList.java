package com.skp.test.linkedlist;

public class LinkedList {
	private Node head;

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
	}
	
	public Node getHead() {
		return head;
	}
	
	public void add(Node node) {
		if (head == null) {
			head = node;
			return;
		}
		
		Node start = head;
		while (start.getNext() != null) {
			start = start.getNext();
		}
		
		start.setNext(node);
	}
	
	public void display() {
		Node start = head;
		while (start != null) {
			System.out.println(start.getVal());
			start = start.getNext();
		}
	}
}
