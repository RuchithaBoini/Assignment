package com.src;

public class TreeNode {
	
	public boolean checkStrict(Node n)
	{
		if(n.left == null && n.right == null)
		{
			return true;
		}
		if(n.left != null && n.right != null)
		{
			return true;
		}
		else
			return false;
		
	}

	public static void main(String[] args) {
		TreeNode t = new TreeNode();
		Node node = new Node(50);
		node.left = new Node(45);
		//node.right = new Node(78);
		
		boolean answer = false;
		answer =t. checkStrict(node);
		if(answer)
			System.out.println("Binary tree is strict.");
		else
			System.out.println("Binary tree not strict.");
	
	}

}
class Node{
	int data;
	Node left,right;
	
	public Node() {
		super();
	}

	public Node(int data) {
		super();
		this.data = data;
		left = null;
		right = null;
	}
}

