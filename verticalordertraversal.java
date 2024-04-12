package trees;
import java.util.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import Arrays.ArrayList;


public class verticalordertraversal {
static Node root;


static class Pair{
	int hd;
	Node node;
	public Pair(int hd,Node node) {
		this.node=node;
		this.hd=hd;
	}
}



static void verticalorder(Node root){
	Queue<Pair> q=new LinkedList<>();
	Map <Integer,ArrayList<Integer>> map=new TreeMap<>();
	
	q.add(new Pair(0,root));
	while(!q.isEmpty()) {
		Pair curr=q.remove();
		
		if(map.containsKey(curr.hd)) {
			map.get(curr.hd).add(curr.node.data);	
		}
		else {
			ArrayList<Integer>temp=new ArrayList<>();
			temp.add(curr.node.data); 
			map.put(curr.hd,temp);
		}
		
		if(curr.node.left!=null) {
			q.add(new Pair(curr.hd-1,curr.node.left));
		}
		if(curr.node.right!=null) {
			q.add(new Pair(curr.hd+1,curr.node.right));
		}
	}

		ArrayList<Integer> ans=new ArrayList<>();
		for(Map.Entry<Integer,ArrayList<Integer>>entry : map.entrySet()) {
			entry.getValue();
			System.out.print(ArrayList.data + " ");
		}
	
}

	public static void main(String[] args) {
		verticalordertraversal tree=new verticalordertraversal();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left=new Node(7);
        tree.root.right.right.right=new Node(8);
        
        
        verticalorder(root);
        
	}

}
