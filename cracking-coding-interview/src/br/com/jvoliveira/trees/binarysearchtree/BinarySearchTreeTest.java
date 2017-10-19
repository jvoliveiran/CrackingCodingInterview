package br.com.jvoliveira.trees.binarysearchtree;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void testBase(){
		Node root = createBaseCase();
		boolean result = BinarySearchTree.checkBST(root);
		Assert.assertTrue(result);
	}

	@Test
	public void testCase1(){
		Node root = createBTCase1();
		boolean result = BinarySearchTree.checkBST(root);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCase2(){
		Node root = createBTCase2();
		boolean result = BinarySearchTree.checkBST(root);
		Assert.assertTrue(!result);
	}
	
	@Test
	public void testCase3(){
		Node root = createBTCase3();
		boolean result = BinarySearchTree.checkBST(root);
		Assert.assertTrue(result == false);
	}
	
	private Node createBTCase3() {
		Node root = new Node(17);
		root.right = new Node(24);
		root.right.left = new Node(20);
		
		root.right.left.right = new Node(22);
		root.right.left.right.left = new Node(21);
		root.right.left.right.right = new Node(23);
		
		root.right.left.left = new Node(18);
		root.right.left.left = new Node(17);
		root.right.left.right = new Node(19);
		
		root.right.right = new Node(28);
		root.right.right.left = new Node(26);
		root.right.right.left.left = new Node(25);
		root.right.right.left.right = new Node(27);
		root.right.right.right = new Node(30);
		root.right.right.right.left = new Node(29);
		root.right.right.right.right = new Node(31);
		return root;
	}

	private Node createBaseCase() {
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		return root;
	}
	
	private Node createBTCase1(){
		Node root = new Node(4);
		
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		
		root.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(7);
		return root;
	}
	
	private Node createBTCase2(){
		Node root = new Node(3);
		
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		
		root.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(7);
		return root;
	}
}
