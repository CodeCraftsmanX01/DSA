package trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import Arrays.ArrayList;
import trees.verticalordertraversal.Pair;

public class topview {
	
	static Node root;
	static class Pair{
		//hd is horizontal distance
		int hd;
		Node node;
		public Pair(int hd,Node node) {
			this.node=node;
			this.hd=hd;
		}
	}
	
public static void top(Node root){
	Queue<Pair> q=new LinkedList<>();
	Map <Integer,Integer> map=new TreeMap<>();
	
	q.add(new Pair(0,root));
	while(!q.isEmpty()) {
		Pair curr=q.remove();
		
		if(!map.containsKey(curr.hd)) {
			map.put(curr.hd,curr.node.data);	
		}
		
		if(curr.node.left!=null) {
			q.add(new Pair(curr.hd-1,curr.node.left));
		}
		if(curr.node.right!=null) {
			q.add(new Pair(curr.hd+1,curr.node.right));
		}
	}
	//ArrayList<Integer> ans=new ArrayList<>();
	for(Map.Entry<Integer,Integer>entry : map.entrySet()) {
		System.out.print(entry.getValue()+"->");
	}
	
}

	public static void main(String[] args) {
		
		Node root = new Node(7);
        root.left = new Node(6);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(1);
        root.right.left = new Node(8);
        root.right.right=new Node(3);
        
       top(root);
	}

}
