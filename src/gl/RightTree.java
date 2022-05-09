package gl;

import java.io.*;
	
  class Node{
	int val;
	Node left, right;
	
	 Node (int data) 
	 {
		val=data;
		left=right=null;
		
	}
	}
  
  class RightTree
  
  {
       public static Node node;
       static Node prevNode =null;
       static Node headNode =null;
       
       static void flattenBTTSkewed(Node root, int order)
	{
		
		if (root == null) 
		{
		return;
		} 
		
		
		if (order>0)
		{
			flattenBTTSkewed (root.right , order);
			
		}
		else {
			flattenBTTSkewed (root.left, order);
		}
		
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if (headNode == null){
			headNode =root;
			root.left =null;
			prevNode=root;
				
		}
		else 
		{
			
			prevNode.right=root;
			
			root.left= null;
			prevNode=root;
		
		}
		
	if(order>0) {
		flattenBTTSkewed(leftNode, order);
	}
	else
	{
		flattenBTTSkewed(rightNode , order);
	}
	}
	
		static void rightNode(Node root) {
		 if (root == null)
			 return;
		 else {
			 System.out.print(root.val +" " );
			 
			 rightNode(root.right);
			
		 }	
	}
	
	public static void main(String[] args) {
		
		RightTree tree = new RightTree();
		
		tree.node = new Node(50);
	    tree.node.left = new Node(30);
	    tree.node.right = new Node(10);
	    tree.node.left.left= new Node(60);
	    tree.node.right.left= new Node(55);
	    
	    int order =0;
	    
	    flattenBTTSkewed(node, order);
	     rightNode(headNode);
	   
	   
	}  	   
}
