package br.com.jvoliveira.linkedlist.detectcycle;

public class Node {

	int data;
	
	Node next;
	
	public Node(int i) {
		data = i;
	}

	public Node(int i, Node next) {
		data = i;
		this.next = next;
	}
	
}
