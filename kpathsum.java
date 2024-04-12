package trees;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class kpathsum {
static Node root;
static int count=0;
	static void solve(Node root,int tragetSum, List<Integer>path) {
	//base case
		if(root==null) {
			return;
		}
		
		path.add(root.data);
		
		solve(root.left,tragetSum,path);
		solve(root.right,tragetSum,path);

		//check for k sum
		int size=path.size();
		int sum=0;
		for(int i=size-1; i>=0; i--) {
			sum+=path.get(i);
			if(sum==tragetSum) {
				 count++;
			}
			
		}		
		path.remove(size-1);
		}
	
	static int sum(Node root,int targetSum) {
		
		ArrayList<Integer>path=new ArrayList<>();
		solve(root,targetSum,path);
		
        return count;
	}


	public static void main(String[] args) {
		kpathsum tree=new kpathsum();
		tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(1);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(1);
        tree.root.left.right.left = new Node(1);
        tree.root.right.left = new Node(4);
        tree.root.right.right=new Node(5);
        tree.root.right.right.right=new Node(6);
        tree.root.right.left.left=new Node(1);
        tree.root.right.left.right=new Node(2);
        

        
        int ans=sum(root,5);
        System.out.println(ans);
        
	}

}
