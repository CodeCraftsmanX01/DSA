package trees;


public class sumtree {
static Node root;


	static int sum(Node root){
	    if(root == null){
	        return 0;
	    	}
	    int left=sum(root.left);
	    int right=sum(root.right);
	    
	    return left+right+root.data;
	}

	
	static int isSumTree(Node root){
	    int ls,rs;
	   
	    if(root == null || (root.left == null && root.right == null)){
	        return 1;
	    	}
	   
	    ls = sum(root.left);
	    rs = sum(root.right);
	   
	    // If the node and both of its
	    // children satisfy the property
	    // return 1 else 0
	    if((root.data == ls + rs) && isSumTree(root.left) != 0 && isSumTree(root.right) != 0){
	        return 1;
	    	}
	    return 0;
	}



	public static void main(String[] args) {
		sumtree  tree = new sumtree();
	     tree.root = new Node(26);
	     tree.root.left = new Node(10);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(6);
	     tree.root.right.left = new Node(3);

	     
	     if(isSumTree(root) != 0){
	        System.out.println("The given tree is a SumTree");
	        }
	     else{
	        System.out.println("The given tree is not a SumTree");
	        }
	}

}
