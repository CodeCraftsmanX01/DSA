package practicetree;

public class balancedtree {
static Node root;
static Node left,right;

public static boolean balanced(Node root) {
	if(root==null) {
		return true;
	}
	
	boolean left=balanced(root.left);
	boolean right=balanced(root.right);
	
	boolean diff=Math.abs(height(root.left)-height(root.right))<=1;
	
	if(left&& right && diff) {
		return true;
	}
	else {
		return false;
	}		
}
	
	
public static int height(Node root) {
	if(root==null) {
		return  0;
	}
	
	int left=height(root.left);
	int right=height(root.right);
	
	return Math.max(left,right)+1;
}


	public static void main(String[] args) {
		balancedtree  tree = new balancedtree();
	     tree.root = new Node(10);
	     tree.root.left = new Node(8);
	     tree.root.right = new Node(2);
	     tree.root.left.left = new Node(3);
	     tree.root.left.right = new Node(5);
	     tree.root.right.left = new Node(7);
	     
	     boolean ans=balanced(root);
	     System.out.println("\\\\ TREE IS BALANCED OR NOT \\\\ :-"+ans);
	     
	
	}

}
