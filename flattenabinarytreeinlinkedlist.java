package trees;

public class flattenabinarytreeinlinkedlist {
	static Node root;
	static Node prev=null;
	
	public static void flatten(Node root) {
		if(root==null) {
			return;
		}
		
		flatten(root.left);
		flatten(root.right);
		
		root.right=prev;
		root.left=null;
		prev=root;
		
	}
	
	
public static void main(String[] args) {
	flattenabinarytreeinlinkedlist tree=new flattenabinarytreeinlinkedlist();
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
    
    flatten(root);
    
    while(root!=null)
    {
        System.out.print(root.data+"->");
        root=root.right;
    }
    System.out.print("END");
  }
}
