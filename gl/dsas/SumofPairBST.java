package com.samir.gl.dsas;

import java.util.HashSet;
import java.util.Set;

public class SumofPairBST {
	static class Node{
		int data;
		Node leftNode, rightNode;
		public Node(int data) {
			this.data = data;
			leftNode = rightNode = null;
		}
	}
	static Node createNode(int nodeData) {
		Node newNode = new Node(nodeData);
		return newNode;
	}
	public Node insert(Node root, int key) {
		if(root==null)
			return createNode(key);
		
		if(key<root.data)
			root.leftNode= insert(root.leftNode, key);
		else
			root.rightNode= insert(root.rightNode, key);
		return root;
	}

	public static void main(String[] args) {
	Node root = null;
	SumofPairBST findsp = new SumofPairBST();
	root = findsp.insert(root, 40);
	root = findsp.insert(root, 20);
	root = findsp.insert(root, 60);
	root = findsp.insert(root, 10);
	root = findsp.insert(root, 30);
	root = findsp.insert(root, 50);
	root = findsp.insert(root, 70);
	int targetSum =130;
	findsp.findpairofgivenSum(root, targetSum);
	findsp.inOrder(root);

	}
	private void inOrder(Node root) {
		if(root!=null) {
		inOrder(root.leftNode);
		System.out.print(root.data + " ");
		inOrder(root.rightNode);}
		
	}
	private void findpairofgivenSum(Node root, int targetSum) {
		Set<Integer> set = new HashSet<Integer>();
		if(!findPairUtil(root, targetSum, set))
			System.out.println("Pairs do not exist");
		
	}
	private boolean findPairUtil(Node root, int targetSum, Set<Integer> set) {
		if(root==null)
			return false;
		return false;
	
	
	}

}
