package trees;

public class BinaryTreetraversal {
	Node root;

	  // Traverse tree
	  public void traverseTree(Node node) {
	    if (node != null) {
	      traverseTree(node.left);
	      System.out.print(" " + node.data);
	      traverseTree(node.right);
	    }
	  }
	  
	 
	  public static void main(String[] args) {

	    // create an object of BinaryTree
	    BinaryTreetraversal tree = new BinaryTreetraversal();

	    // create nodes of the tree
	    tree.root = new Node(1);
	    tree.root.left=new Node(2);
	    tree.root.right=new Node(3);
	    tree.root.left.left=new Node(4);
	    tree.root.left.right=new Node(5);
	    tree.root.left.left.left=new Node(6);
	    tree.root.left.left.right=new Node(7);
	    tree.root.right.left=new Node(8);
	    tree.root.right.right=new Node(9);
	   
	    
	    

	    System.out.print("\nBinary Tree: ");
	    tree.traverseTree(tree.root);
	    
	  }
}
