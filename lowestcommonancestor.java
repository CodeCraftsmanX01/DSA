package trees;

public class lowestcommonancestor {
static Node root;


	public static  Node lca(Node root,int n1, int n2) {
	if(root==null) {
		return null;
	}
	
	if(root.data==n1 || root.data==n2) {
		return root;
	}
	
	Node leftans=lca(root.left,n1,n2);
	Node rightans=lca(root.right,n1,n2);
	
	if(leftans!=null && rightans!=null) {
		return root;
	}
	else if(leftans!=null && rightans==null) {
		return leftans;
	}
	else if(leftans==null && rightans!=null) {
		return rightans;
	}
	else {
		return null;
	}
	
	}

	

	public static void main(String[] args) {
		lowestcommonancestor tree=new lowestcommonancestor();
		
		tree.root=new Node(5);
		tree.root.left=new Node(4);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(7);
		tree.root.left.right=new Node(8);
		tree.root.left.right.left=new Node(12);
		tree.root.left.right.right=new Node(9);
		tree.root.right.left=new Node(22);
		tree.root.right.right=new Node(27);
		tree.root.right.right.left=new Node(29);
		
		
		 Node ans =lca(root, 8, 27);
		 System.out.println(ans.data);

	}

}
