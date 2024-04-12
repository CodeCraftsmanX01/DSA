package BST;

import org.w3c.dom.Node;

public class minmaxvalueinBST {
static int data;
static Node root;
static Node left;

public static Node min(Node root) {
	
	Node temp=root;
	
	while(temp.left!=null) {
		temp=temp.left;
	}
	return temp;
}
public static Node max(Node root) {
	
	Node temp=root;
	
	while(temp.right!=null) {
		temp=temp.right;
	}
	return temp;
}
	
	public static void main(String[] args) {
		min(root);
		max(root);

	}

}
