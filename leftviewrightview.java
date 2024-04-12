package trees;


import java.util.LinkedList;
import java.util.Queue;


public class leftviewrightview {
static Node root;


public static void leftview(Node root) {
	if(root==null) {
		return;
	}
	
	Queue<Node> q=new LinkedList<>();
	
	q.add(root);
	
	while(!q.isEmpty()) {
		int n = q.size();
		
		for(int i=0; i<n; i++) {
		Node curr=q.peek();
		q.remove();
		
		if(i==0) {
		System.out.print(curr.data+" ");
		}
		if(curr.left!=null) {
			q.add(curr.left);
		}
		if(curr.right!=null) {
			q.add(curr.right);
		}
		 }
		
	}	
}


public static void rightview(Node root) {
	if(root==null) {
		return;
	}
	Queue<Node> q=new LinkedList<>();
	q.add(root);

	while(!q.isEmpty()) {
		int n=q.size();
		
		for(int i=0;i<n; i++) {
		Node curr=q.peek();
		q.remove();
		
		if(i==n-1) {
		System.out.print(curr.data+" ");
		}
		if(curr.left!=null) {
			q.add(curr.left);
		}
		if(curr.right!=null) {
			q.add(curr.right);
		}
		}
		
	}	
}


	public static void main(String[] args) {
		
		leftviewrightview tree=new leftviewrightview();
		Node root = new Node(7);
        root.left = new Node(6);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(1);
        root.left.right.left=new Node(4);
        root.right.left = new Node(8);
        root.right.right=new Node(3);

        
        System.out.println("Left view of the binary tree is :- ");
        leftview(root);
        System.out.println();
        System.out.println();
        System.out.println("Right view of the binary tree is :- ");
        rightview(root);
	}

}
