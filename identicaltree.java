package practicetree;


public class identicaltree {
static Node root1;
static Node root2;
static Node left,right;


public static boolean identical(Node root1, Node root2) {
	if(root1==null && root2==null) {
		return true;
	}
	if(root1!=null && root2==null) {
		return false;
	}
	if(root1==null &&root2!=null) {
		return false;
	}
	if(root1!=null && root2!=null) {
	if(root1.data==root2.data && identical(root1.left,root2.left)  && identical(root1.right,root2.right )) {
		return true;
	}
	}
	
	return false;
	
}

	public static void main(String[] args) {
		identicaltree  tree = new identicaltree();
	     tree.root1 = new Node(10);
	     tree.root1.left = new Node(8);
	     tree.root1.right = new Node(2);
	     tree.root1.left.left = new Node(3);
	     tree.root1.left.right = new Node(5);
	     tree.root1.right.left = new Node(7);
	     
	     tree.root2 = new Node(10);
	     tree.root2.left = new Node(8);
	     tree.root2.right = new Node(2);
	     tree.root2.left.left = new Node(3);
	     tree.root2.left.right = new Node(5);
	     tree.root2.right.left = new Node(7);
	     
	     
	     boolean ans=identical(root1,root2);
	     System.out.println(ans);
	     
	}

}
