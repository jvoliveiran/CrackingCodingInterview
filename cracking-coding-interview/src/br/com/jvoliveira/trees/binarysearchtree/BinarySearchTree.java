package br.com.jvoliveira.trees.binarysearchtree;

public class BinarySearchTree {
	
	public static boolean checkBST(Node root){
		return checkSubBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean checkSubBST(Node node, int minValue, int maxValue) {
		if(node == null)
			return true;
		
		if(node.data < minValue || node.data > maxValue)
			return false;
		
		return checkSubBST(node.left,minValue,node.data-1) && checkSubBST(node.right, node.data+1, maxValue);
	}
	
}
