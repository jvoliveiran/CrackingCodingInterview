package br.com.jvoliveira.linkedlist.detectcycle;

import org.junit.Assert;
import org.junit.Test;

public class DetectCycleTest {

	@Test
	public void baseTestWithoutCycle(){
		Node head = new Node(1);
		boolean result = DetectCycle.hasCycle(head);
		Assert.assertFalse(result);
	}

	@Test
	public void baseTestWithCycle(){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3, head.next);
		boolean result = DetectCycle.hasCycle(head);
		Assert.assertTrue(result);
	}
	
	@Test
	public void emptyHeadTest(){
		Node head = null;
		boolean result = DetectCycle.hasCycle(head);
		Assert.assertFalse(result);
	}
	
	@Test
	public void longCycle(){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5,head);
		boolean result = DetectCycle.hasCycle(head);
		Assert.assertTrue(result);
	}
	
	@Test
	public void repeatedData(){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		boolean result = DetectCycle.hasCycle(head);
		Assert.assertFalse(result);
	}
}
