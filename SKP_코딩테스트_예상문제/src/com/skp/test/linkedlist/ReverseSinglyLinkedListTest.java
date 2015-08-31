package com.skp.test.linkedlist;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ReverseSinglyLinkedListTest {

	private Node aNode;
	private Node bNode;
	private Node cNode;
	private ReverseSinglyLinkedList sut;

	@Before
	public void setup() {
		aNode = new Node(1);
		bNode = new Node(2);
		cNode = new Node(3);
		
		sut = new ReverseSinglyLinkedList();
	}
	
	@Ignore
	@Test
	public void testReverse() throws Exception {
		LinkedList linkedList = new LinkedList();
		linkedList.add(aNode);
		linkedList.add(bNode);
		
		sut.reverse(linkedList);
		linkedList.display();

	}
	
	@Test
	public void testReverse_whenItemIs3() throws Exception {
		LinkedList linkedList = new LinkedList();
		linkedList.add(aNode);
		linkedList.add(bNode);
		linkedList.add(cNode);
		
		linkedList.display();
		sut.reverse(linkedList);
		
		linkedList.display();
	}

}
