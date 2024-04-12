package practicetree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import Arrays.ArrayList;

public class levelordertraversal {
	static Node root;
	static  Node left, right;
	
	public static void levelorder(Node root) {
		
		if(root==null) {
			return;
		}
		
		
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node temp=q.peek();
			q.remove();
			
			if(temp==null) {
				System.out.println();
				if(!q.isEmpty()) {
					q.add(null);
				}
			}
			else {
				System.out.print(temp.data+" ");
				if(temp.left!=null) {
					q.add(temp.left);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		levelordertraversal tree=new levelordertraversal();

		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right=new Node(8);
        tree.root.right.right=new Node(6);
        tree.root.right.right.right=new Node(9);
        tree.root.right.right.right.right=new Node(10);
        
        levelorder(root);
	}

}
