package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class inserting {
	
public static int data;
static inserting left;
static inserting right;

	inserting(int d){
		inserting.data=d;
		inserting.left=null;
		inserting.right=null;
	}
	
	public static void takeinput(inserting root) {
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		
		while(data!=-1) {
			insertintbst(root,data);
			data=s.nextInt();
		}
		
	}
	public static inserting insertintbst(inserting root, int data) {
		if(root==null) {
			root=new inserting(data);
			return root;
		}
		
		if(data>inserting.data) {
			inserting.right=insertintbst(inserting.right,data);
		}
		else {
			inserting.left=insertintbst(inserting.left,data);
		}
		
		return root;
		
	}

	
	//level order traveral
	public static void levelordertraversal(inserting root) {
		if(root==null) {
			return;
		}
		Queue<inserting> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			inserting temp=q.peek();
			q.remove();
			
			if(temp==null) {
				System.out.println();
				if(!q.isEmpty()){
					q.add(null);
				}
			}
			
			else {
				System.out.print(inserting.data+" ");
				if(inserting.left!=null) {
					q.add(inserting.left);
				}
				if(inserting.right!=null) {
					q.add(inserting.right);
				}
			}
		}
	}
	
	
	//function to delete an node	
	
	public static inserting deleteNode(inserting root,int key) {
		if(root==null) {
			return null;
		}
		
		if(root.data==key) {
			//0 child
			if(root.left==null && root.right==null) {
				return null;
			}
			
			//1 child
			//it may be left
			if(root.left!=null && root.right==null) {
				inserting temp=root.left;
				return temp;
			}
			//it may be right
			if(root.left==null && root.right!=null) {
				inserting temp=root.right;
				return temp;
			}
			
			//2 child
			if(root.left!=null && root.right!=null) {
				int min=minValue(root.right).data;
				root.data=min;
				root.right=deleteNode(root.right,min);
				return root;
			}
			
		}
		
		else if(root.data>key) {
			root.right=deleteNode(root.right,key);
			return root;
		}
		
		else {
			root.left=deleteNode(root.left,key);
			return root;
		}
		
		return root;
	}
	
	//function to print minimum value in BST
	
	public static inserting minValue(inserting root) {
	inserting temp=root;
	
	while(temp.left!=null) {
		temp=temp.left;
	}
		return temp;
	}
	
	//function to print maximum value in BST
	
	public static inserting maxValue(inserting root) {
		inserting temp=root;
		
		while(temp.right!=null) {
			temp=temp.right;
		}
			return temp;
		}

	public static void main(String[] args) {
		inserting root=null;
		System.out.println("eneter data to create BST");
		takeinput(root);
		
		System.out.println("deteleting an elemnt");
		root=deleteNode(root,8);
		
		//System.out.println("printing the bst");
		//levelordertraversal(root);
	}

}
