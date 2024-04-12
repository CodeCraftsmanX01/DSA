package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class traversals {
	public int data;
	public traversals left;
	public traversals right;
	
	traversals(int d){
		this.data=d;
		this.left=null;
		this.right=null;
	}
	
	//building a binary tree
	static traversals buildtree(traversals root) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter data");
		int data=s.nextInt();
		root=new traversals(data);
		
		if(data==-1) {
			return null;
		}
		
		System.out.println("enter data for inserting in left "+data);
		root.left=buildtree(root.left);
		
		
		System.out.println("enter data for inserting in right "+data);
		root.right=buildtree(root.right);
		
		
		return root;
	}
	
	//level order traversal
	static void levelorder(traversals root) {
		Queue<traversals> q=new LinkedList<traversals>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			traversals temp=q.peek();
			
			q.remove();
			
			if(temp==null){
				//iska mtlb h purana level compelete traverse ho chuka h
				System.out.println();
				if(!q.isEmpty()) {
					//queue still has some chld nodes
					q.add(null);
				}
			}
			
			else {
			System.out.print(temp.data+" ");
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
			}
			
		}
	}
	
	
	 //inordertraversal
	  static void inorder(traversals root) {
		  if(root==null) {
			  return;
		  }
		  
		  inorder(root.left);
		  System.out.print(root.data+" ");
		  inorder(root.right);
	  }
	  
	  //preorder traversal
	  static void preorder(traversals root) {
		  if(root==null) {
			  return;
		  }
		  
		  System.out.print(root.data+" ");
		  preorder(root.left);
		  preorder(root.right);
	  }
	  
	  //postorder traversal
	  static void postorder(traversals root) {
		  if(root==null) {
			  return;
		  }
		  
		  postorder(root.left);
		  postorder(root.right);
		  System.out.print(root.data+" ");
	  }
	  
	  
	
	public static void main(String[] args) {
		traversals root =null;
		root=buildtree(root);
		//1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1 
		//levelorder
		System.out.println();
		System.out.println();
		System.out.println("LEVEL ORDER traversal of tree is :-");
		levelorder(root);
		System.out.println();
		System.out.println("INORDER traversal of tree is :-");
		inorder(root);
		System.out.println();
		System.out.println("PREORDER traveral of tree is :-");
		preorder(root);
		System.out.println();
		System.out.println("POSTORDER traveral of tree is :-");
		postorder(root);
		
	}

}
