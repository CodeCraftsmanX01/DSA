package trees;

public class burntree {
	static Node root;
	static int ans=-1;
	
	static class Depth{
		int data;
		public Depth(int data){
			this.data=data;
		}
	}
	
	
	public static int minTime(Node root,int target) {
		Depth depth=new Depth(-1);
		burn(root,target,depth);
		return ans;
	}
	
	public static int burn (Node root,int target,Depth depth) {
		if(root==null) {
			return 0;
		}
		if(root.data==target) {
			depth.data=1;
			return 1;
		} 
		Depth leftdepth=new Depth(-1);
		Depth rightdepth=new Depth(-1);
		
		int leftheight=burn(root.left,target,leftdepth);
		int rightheight=burn(root.right,target,rightdepth);
		
		if(leftdepth.data!=-1) {
			ans=Math.max(ans,leftdepth.data+1+rightheight);
			depth.data=leftdepth.data+1;
		}
		else if(rightdepth.data!=-1) {
			ans=Math.max(ans,rightdepth.data+1+leftheight);
			depth.data=rightdepth.data+1;
		}
		
		return  Math.max(leftheight,rightheight)+1;
	}
	
	public static void main(String[] args) { 
		burntree tree=new burntree();
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

        int res=minTime(root,8);
        System.out.println(res);
	}

}
