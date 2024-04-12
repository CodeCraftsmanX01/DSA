package practicetree;


public class sumtree {
static Node root;
static Node left;
static Node right;

public static boolean issumtree(Node root) {
	if(root==null || root.left==null || root.right==null) {
		return true;
	}
	
	int ls=sum(root.left);
	int rs=sum(root.right);
	
	if((ls+rs)==root.data ) {
		return true;
	}
	else {
		return false;
	}
}



public static int sum(Node root) {
	if(root==null) {
		return 0;
	}
	
	int left=sum(root.left);
	int right=sum(root.right);
	
	return left+right+root.data;
}



	public static void main(String[] args) {
		sumtree  tree = new sumtree();
	     tree.root = new Node(26);
	     tree.root.left = new Node(10);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(6);
	     tree.root.right.left = new Node(3);
	     
	     boolean ans=issumtree(root);
	     System.out.println(ans);

	}

}
