package trees;

public class diameteroftree {
	static Node root;
//diamater of tree means longest path between any two nodes in a tree
	
public static int diameter(Node root) {
	//base case
	if(root==null) {
		return 0;
	}
	int opt1=diameter(root.left);
	int opt2=diameter(root.right);
	int opt3=height(root.left)+height(root.right);
	
	return Math.max(opt1,Math.max(opt2,opt3));
}


public static int height(Node root) {
	//base case\
	if(root==null) {
	return 0;
	}
	
	int left=height(root.left);
	int right=height(root.right);
	
	return Math.max(left,right)+1;
}


	public static void main(String[] args) {
		diameteroftree  tree = new diameteroftree();
	     tree.root = new Node(10);
	     tree.root.left = new Node(8);
	     tree.root.right = new Node(2);
	     tree.root.left.left = new Node(3);
	     tree.root.left.right = new Node(5);
	     tree.root.right.left = new Node(7);
	     

	     int ans=diameter(root);
	     System.out.println(ans);
	}

}
