package practicetree;

public class diameteroftree {
static Node root;
static Node left,right;

public static int diameter(Node root) {
	if(root==null) {
		return 0;
	}
	
	int opt1=diameter(root.left);
	int opt2=diameter(root.right);
	int opt3=height(root.left)+height(root.right);
	
	return Math.max(opt1,(Math.max(opt2,opt3)));
}




private static int height(Node root) {
	if(root==null) {
		return 0;
	}
	
	int left=height(root.left);
	int right=height(root.right);
	
	return  Math.max(left,right)+1;
}




public static void main(String[] args) {
		
		diameteroftree tree=new diameteroftree();

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
	    
	    int ans=diameter(root);
	    System.out.println(ans);
	}
    
}
