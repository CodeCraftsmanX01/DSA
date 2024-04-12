package practicetree;

public class boundarytraversal {
static Node root;
static Node left,rght;

public static void leftnodes(Node root) {
	if(root==null) {
		return;
	}
	
	if(root.left!=null) {
		System.out.print(root.data+" ");
		leftnodes(root.left);
	}
	else if(root.right!=null){
		System.out.print(root.data+" ");
		leftnodes(root.right);
	}
}



public static void rightnodes(Node root) {
	if(root==null) {
		return;
	}
	
	if(root.right!=null){
		rightnodes(root.right);
		System.out.print(root.data+" ");
	}
	else if(root.left!=null) {
		rightnodes(root.left);
		System.out.print(root.data+" ");

	}
	
	
}



public static void leafnodes(Node root) {
	if(root==null) {
		return;
	}
	
	leafnodes(root.left);
	
	if(root.left== null && root.right==null) {
		System.out.print(root.data+" ");
	}
	
	leafnodes(root.right);
}


/*public static void printBoundary(Node node){
    if (node == null) {
        return;
    }

   System.out.print(node.data + " ");

    leftnodes(node.left);

    leafnodes(node.left);
    leafnodes(node.right);

    // Print the right boundary in bottom-up manner
    rightnodes(node.right);
}*/

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

        
        leftnodes(root);
        leafnodes(root);
        rightnodes(root);
        
        //printBoundary(root);
        }

}
