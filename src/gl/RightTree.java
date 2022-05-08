package gl;

import java.util.Deque;

import java.util.LinkedList;

public class RightTree {
	
	Deque<Node> queue = new LinkedList<Node>();
	
	static class Node{
	int key;
	Node left, right;
	};
	
	static Node newNode(int data) {
		Node temp = new Node();
		temp.key = data;
		temp.left= null;
		temp.right= null;
		return temp;
	}
	

	Node insertNode(Node root, int key) 
	{
		// Create a new nodeNode 
		Node newNode = newNode(key);
		
		if (root == null) 
		{
			root = newNode;
			queue.add(root);
		return root;
		} else{
			Node node;node = queue.remove();
		System.out.println("parent is: " + node.key);
		if (node.left == null){
			node.left = newNode;
		queue.add(node.left);
		queue.addFirst(node);
		return root;
		
		}
		else if (node.right == null)
		{
			
			node.right = newNode;
		queue.add(node.right);
		return root;
		
		
		}
		}
		return root;
	}

	
	static void Inorder(Node root)
	{
		if (root==null)
			return;
		else {
			Inorder(root.right);
			System.out.println(root.key +" ");
			Inorder(root.left);
		}
	}

	static void rightNode(Node root) {
		 if (root == null)
			 return;
		 else {
			 System.out.print(root.key +" " );
			 
			 rightNode(root.right);
			
		 }	
	}
	
	public static void main(String[] args) {
		
		
		Node root= null;
		
		RightTree tree = new RightTree();
		
		tree.root = new Node(50);
	    tree.root.left = new Node(30);
	    tree.root.right = new Node(10);
	    tree.root.left.left= new Node(60);
	    tree.root.right.left= new Node(55);
	     Inorder(root);
	     rightNode(root);
	     System.out .println("\n right skewed tree values are:");
	   
	}  	   
}
