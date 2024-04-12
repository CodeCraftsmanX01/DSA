package practicetree;

public class traversal {
static Node root;
static  Node left, right; 


//inordeer traversal
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		
		inorder(root.left);
		
		System.out.print(root.data+"-> ");
		
		inorder(root.right);
	}
	
//preorder traversal	
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+"-> ");
		
		preorder(root.left);
		
		preorder(root.right);
	}
	
//postorder traversal	
	public static void postorder(Node root) {
		if(root==null) {
			return;
		}
		
		postorder(root.left);
		
		postorder(root.right);
		
		System.out.print(root.data+"-> ");
	}


	public static void main(String[] args) {
		traversal tree=new traversal();

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
        
        
        System.out.println("inorder traversal of tree is :-");
        System.out.println();
        inorder(root);
        System.out.println();
        System.out.println();
        System.out.println("preorder traversal of tree is :-");
        System.out.println();
        preorder(root);
        System.out.println();
        System.out.println();
        System.out.println("postorder traversal of tree is :-");
        System.out.println();
        postorder(root);
        
	}

}
