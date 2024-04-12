package trees;

public class heightoftree {
	static Node root;
	
	public static int maxDepth(Node root) {
		 if(root==null){
	            return 0;
	        }
	        int left=maxDepth(root.left);
	        int right=maxDepth(root.right);
	        
	        return Math.max(left,right)+1;
	}
	
public static void main(String[] args) {
	heightoftree  tree = new heightoftree();
     tree.root = new Node(10);
     tree.root.left = new Node(8);
     tree.root.right = new Node(2);
     tree.root.left.left = new Node(3);
     tree.root.left.right = new Node(5);
     tree.root.right.left = new Node(7);
     
     int ans=maxDepth(root);
     System.out.println(ans);
}
}
