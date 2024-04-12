package trees;

public class balancedtree {
	static Node root;
	
	//function to check that tree is balanced or not
	public static boolean isBalanced(Node root) {
        //base case
        if(root==null){
            return true;
        }
        
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        boolean difference=Math.abs(height(root.left)-height(root.right))<=1;
        
        if(left&& right&& difference){
            return true;
        }
        else{
            return false;
        }
    }
	
    //function for height of tree
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        
        return Math.max(left,right)+1;
    }
    
    
	public static void main(String[] args) {
		balancedtree  tree = new balancedtree();
	     tree.root = new Node(10);
	     tree.root.left = new Node(8);
	     tree.root.right = new Node(2);
	     tree.root.left.left = new Node(3);
	     tree.root.left.right = new Node(5);
	     tree.root.right.left = new Node(7);
	     
	     boolean ans=isBalanced(root);
	     System.out.println(ans);
	     

	}

}
