package br.com.jvoliveira.linkedlist.detectcycle;

import java.util.ArrayList;
import java.util.List;

public class DetectCycle {

	public static boolean hasCycle(Node head){
		List<Integer> visitedNodes = new ArrayList<>();
		if(head == null)
			return false;
		
		return visitNode(head,visitedNodes);
	}

	private static boolean visitNode(Node node, List<Integer> visitedNodes) {
		if(visitedNodes.contains(node.hashCode()))
			return true;
		if(node.next == null)
			return false;
		
		visitedNodes.add(node.hashCode());
		return visitNode(node.next,visitedNodes);
	}
	
}
