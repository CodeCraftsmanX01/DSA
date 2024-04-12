package trees;

import java.util.Queue;

import Arrays.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class zigzagtraversal {
static Node root;

//using level order traversal
public static List<List<Integer>> zigzagLevelOrder(Node root) {
    //we need to return this so cgreated list of lsit
     List<List<Integer>> l = new ArrayList<>();
     
     Queue<Node> q = new LinkedList<>();
     int counter = -1;
     if(root == null)
     return l;
     q.add(root);
     
     while(!q.isEmpty())
     {
         counter++;
         Node temp=q.peek();
         int len = q.size();
         List<Integer> sl = new ArrayList<>();
         
         for(int j = 0; j<len;j++){
         if(q.peek().left != null)
             q.add(q.peek().left);
         if(q.peek().right != null)
             q.add(q.peek().right);
         sl.add(q.remove().data);
         }
         
     if(counter % 2 == 1){
         Collections.reverse(sl);
         l.add(sl);
     }
     else{
         l.add(sl);
     }
 }
     return l;
 }
	
	


	public static void main(String[] args) {
		zigzagtraversal tree=new zigzagtraversal();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left=new Node(7);
        tree.root.right.right.right=new Node(8);
        
        System.out.println("level order traversal :-");
         ArrayList<Integer> ar1=new ArrayList<Integer>();
         ((List<List<Integer>>) ar1).addAll(zigzagLevelOrder(root));
        System.out.println(ar1);
	}

}
