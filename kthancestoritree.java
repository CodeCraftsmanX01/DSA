package trees;

public class kthancestoritree {
static Node root;
static int k=2;

	static Node solve(Node root, int node) {
		if(root==null) {
			return null;
			}
		if(root.data==node) {
			return root;
		}
		
		Node leftans=solve(root.left, node);
		Node rightans=solve(root.right, node);
		
		if(leftans!=null && rightans==null) {
			k--;
			if(k<=0) {
				k=Integer.MAX_VALUE;
				return root;
			}
			return leftans;
		}
		if(leftans==null && rightans!=null) {
			k--;
			if(k<=0) {
				k=Integer.MAX_VALUE;
				return root;
			}
			return rightans;
		}
		return null;
		
	}
	
	
	static int kthansestor(Node root,int k,int node){
		Node ans=solve(root,node);
		if(ans==null) {
			return -1;
		}
		else {
			return ans.data;
		}
	}
	public static void main(String[] args) {
		kthancestoritree tree=new kthancestoritree();
		tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(1);
        tree.root.left.right.left = new Node(1);
        tree.root.right.left = new Node(4);
        tree.root.right.right=new Node(5);
        tree.root.right.right.right=new Node(6);
        tree.root.right.left.left=new Node(1);
        tree.root.right.left.right=new Node(2);
        
        
       int ans=kthansestor(root,2,6) ;
       System.out.println(ans);
	}

}
