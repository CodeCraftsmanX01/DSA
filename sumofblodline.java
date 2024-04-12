package trees;

public class sumofblodline {
static Node root;
static int maxsum=0;
static int maxlen=0;

static int sumoflongestpath(Node root) {

int len=0;

int sum=0;

solve(root, sum, len);
 return maxsum;
}

static void solve(Node root, int sum, int len) {
	
	if(root==null)
    {
        if(len>maxlen)
        {
            maxlen=len;
            maxsum=sum;
        }
        else if(len==maxlen)
        {
            maxsum=Math.max(sum,maxsum);
        }
        return;
    } 

	sum=sum+root.data;
	
	solve(root.left, sum, len+1);
	solve(root.right, sum, len+1);
}

	public static void main(String[] args) {
		sumofblodline tree=new sumofblodline();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left=new Node(7);
        tree.root.right.right.right=new Node(8);

        int ans=sumoflongestpath(root);
        System.out.println(ans);
	}

}
