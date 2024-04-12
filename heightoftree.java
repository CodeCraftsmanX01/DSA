package practicetree;

public class heightoftree {
	static Node root;
	static Node left,right;
	
	public static int depth(Node root) {
		if(root==null) {
			return 0;
		}
		
		int left=depth(root.left);
		int right=depth(root.right);
		
		return Math.max(left,right)+1;
	}
	
	
	public static void main(String[] args) {
		heightoftree tree=new heightoftree();

		tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.root.right.left = new Node(7);
       

        int ans=depth(root);
        System.out.println(ans);
	}

}
