package practicetree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import Arrays.ArrayList;

public class bottomview {
static Node root;
static Node left,right;;

public static class pair{
	int hd;
	Node node;
	pair(int hd, Node node){
		this.hd=hd;
		this.node=node;
	}
	
}

public static void bottom(Node root) {
	
	Queue <pair> q=new LinkedList<>();
	Map<Integer,Integer> map=new TreeMap<>();
	q.add(new pair(0,root));
	

	while(!q.isEmpty()) {
		pair curr=q.remove();
		
		map.put(curr.hd,curr.node.data);
		
		if(curr.node.left!=null) {
			q.add(new pair(curr.hd-1,curr.node.left));
		}
		if(curr.node.right!=null) {
			q.add(new pair(curr.hd+1,curr.node.right));
		}
	}
	
	//ArrayList<Integer> ans=new ArrayList<>();
	for(Map.Entry<Integer,Integer>entry : map.entrySet()) {
		System.out.print(entry.getValue()+"->");
	}
	System.out.println("END");
}
	
	public static void main(String[] args) {

		Node root = new Node(7);
        root.left = new Node(6);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(1);
        root.left.right.left=new Node(4);
        root.right.left = new Node(8);
        root.right.right=new Node(3);
        
        bottom(root);
	}

}
