package com.skp.test.linkedlist;

public class ReverseSinglyLinkedList {
	public void swap(Node aNode, Node bNode) {
		Node next = bNode.getNext();
		bNode.setNext(aNode);
		aNode.setNext(next);
	}

	public void reverse(LinkedList list) {
		Node current = list.getHead();
		Node reversedHeadNode = null;
		
		while (current != null) {
			Node next = current.getNext();
			current.setNext(reversedHeadNode);
			reversedHeadNode = current;
			
			current = next;
		}
		
		list.setHead(reversedHeadNode);
	}
}
