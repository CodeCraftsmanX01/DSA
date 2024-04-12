package trees;

public class flattenabinarytreeeindoublyll {
	static Node root;
	static Node prev=null;
	static Node head=null;
	
	//using inorder traversal
	//LNR
	static void converttodDLL(Node root) {
		if(root==null) {
			return;
		}
		converttodDLL(root.left);
		
		if(prev==null) {
			head=root;
		}
		else {
			 root.left = prev;
	         prev.right = root;
		}
		
		prev=root;
		
		converttodDLL(root.right);
		
	}
	
	//function to print linkedlist
	static void printList(Node node)
	{
	    while (node != null)
	    {
	        System.out.print(node.data + "->");
	        node = node.right;
	    }
	    System.out.println("END");
	    
	}
	
	public static void main(String[] args) {
		flattenabinarytreeeindoublyll tree=new flattenabinarytreeeindoublyll();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right=new Node(8);
        tree.root.right.right=new Node(6);
        tree.root.right.right.right=new Node(9);
        tree.root.right.right.right.right=new Node(9);

        converttodDLL(root);
        
        printList(head);
	}

}
