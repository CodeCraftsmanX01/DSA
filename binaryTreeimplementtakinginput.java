package trees;

import java.util.Scanner;
//building tree using recusrsion

public class binaryTreeimplementtakinginput {
	
	public int data;
	public binaryTreeimplementtakinginput left;
	public binaryTreeimplementtakinginput right;
	
	//constructor
	binaryTreeimplementtakinginput(int d){
		this.data=d;
		this.left=null;
		this.right=null;
		}


	static binaryTreeimplementtakinginput buildTree(binaryTreeimplementtakinginput root) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter data");
		int data=s.nextInt();
		root=new binaryTreeimplementtakinginput(data);
		
		if(data==-1) {
			return null;
		}
		
		System.out.println("enter data for inserting in left "+data);
		root.left=buildTree(root.left);
		
		
		System.out.println("enter data for inserting in right "+data);
		root.right=buildTree(root.right);
		
		
		return root;
	}
	
	static void levelordertraversal(binaryTreeimplementtakinginput root) {
		
	}
	
	
	public static void main(String[] args) {
		binaryTreeimplementtakinginput root =null;
		root=buildTree(root);
		//1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1 
	}
}
