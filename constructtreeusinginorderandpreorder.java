package trees;

public class constructtreeusinginorderandpreorder {
static Node root;
static int preorderindex=0;


	static Node BuildTree(int inorder[],int preorder[],int n) {
		preorderindex=0;
		Node ans=solve(inorder,preorder,preorderindex,0,n-1,n);
		return ans;
	}

	static Node solve(int[] inorder, int[] preorder, int preorderindex,int inorderstart,int inorderend,int n) {
	//vbase case
		if(preorderindex>=n || inorderstart>inorderend) {
			return null;
		}
		int element=preorder[preorderindex++];
		Node root=new Node(element);
		int position=findposition(inorder,element,n);
		//recursive calls
		root.left=solve(inorder,preorder,preorderindex,inorderstart,position-1,n);
		root.right=solve(inorder,preorder,preorderindex,position+1,inorderend,n);
		
		return root;
	}

	static int findposition(int[] inorder, int element,int n) {
		
		for(int i=0; i<n; i++) {
			if(inorder[i]==element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//inorder LNR
		//preorder NLR
		
		/*	ALOGORYTM
		 * 1. preorder ke starting element se suru krenge 
		 * 2.name take index as root elemnt from preorder array
		 * 3.find root element position in inorder/
		 * recursion
		 * 4. two calls make \
		 * 5.root ke left ke liye call kr dena inorder ke start se index-1
		 * (inorder start s-------> posiitonof  idex tak
		 * 	6.root right ke liye call kr dena 
		 * (position of index +1 -------> inorder ke end tak)
		 */
		
		int inorder[]= {3,1,4,0,5,2};
		int preorder[]= {0,1,3,4,2,5};
		int n=inorder.length-1;
		
		 Node ans =BuildTree(inorder, preorder, n);
		 System.out.println(ans.data);
		
		
	}
}
