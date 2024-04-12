package trees;

import Arrays.ArrayList;

public class boundarytraversal {

	static Node root;
	//printing left nodes
	public static void leftpart(Node root) {
		if (root == null)
            return;
 
        if (root.left != null) {
            System.out.print(root.data + " ");
            leftpart(root.left);
        }
        else if (root.right != null) {
            System.out.print(root.data + " ");
            leftpart(root.right);
        }
		
	}
	
	//printing right nodes
	public static void rightpart(Node root) {
		if (root == null)
            return;
 
        if (root.right != null) {
            rightpart(root.right);
            System.out.print(root.data + " ");
        }
        else if (root.left != null) {
            rightpart(root.left);
            System.out.print(root.data + " ");
        }
		
	}
	
	//printing leave nodes
	public static void leavespart(Node node){
        if (node == null)
            return;
 
        leavespart(node.left);
 
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        
        leavespart(node.right);
    }
	
	//printing boundary nodes
	 public static void printBoundary(Node node){
	        if (node == null) {
	            return;
	        }
	 
	       System.out.print(node.data + " ");
	 
	        leftpart(node.left);
	 
	        leavespart(node.left);
	        leavespart(node.right);
	 
	        // Print the right boundary in bottom-up manner
	        rightpart(node.right);
	    }
	
	public static void main(String[] args) {
		boundarytraversal tree=new boundarytraversal();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left=new Node(7);
        tree.root.left.right.right=new Node(8);
        tree.root.right.right = new Node(6);
        tree.root.right.right.right=new Node(9);
        tree.root.right.right.right.left=new Node(10);
        tree.root.right.right.right.right=new Node(11);

        printBoundary(tree.root);
	}

}
