package practicetree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.*;
import java.util.ArrayList;

public class verticalordertraversal {
static Node root;
static Node left,right;

static class pair{
	int hd;
	Node node;
	
	pair(int hd,Node node){
		this.node=node;
		this.hd=hd;
	}
}
	

	public static ArrayList<Integer> vertical(Node root) {
		if(root==null) {
			return null;
			}
		Queue<pair> q=new LinkedList<>();
		Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
		
		q.add(new pair(0,root));
		
		while(!q.isEmpty()) {
			pair curr=q.remove();
			
			if(map.containsKey(curr.hd)) {
				map.get(curr.hd).add(curr.node.data);
			}
			else {
				ArrayList<Integer> temp=new ArrayList<>();
				temp.add(curr.node.data);
				map.put(curr.hd,temp);
				
			}
			
			if(curr.node.left!=null) {
				q.add(new pair(curr.hd-1,curr.node.left));
			}
			if(curr.node.right!=null) {
				q.add(new pair(curr.hd+1,curr.node.right));
			}
		}
		
		ArrayList<Integer> ans=new ArrayList<>();
		for(Map.Entry<Integer,ArrayList<Integer>>entry : map.entrySet()) {
			ans.addAll(entry.getValue());  
		}
		
		return ans;
	}


	public static void main(String[] args) {
		verticalordertraversal tree=new verticalordertraversal();
		 Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);
	        root.right.left.right = new Node(8);
	        root.right.right.right = new Node(9);

        System.out.println(vertical(root));
	}

}
