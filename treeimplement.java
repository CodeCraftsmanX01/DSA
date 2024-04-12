package practicetree;

import java.util.Scanner;

public class treeimplement {
public int data;
public treeimplement left;
public treeimplement right;
public static treeimplement root; 
treeimplement(int d){
	this.data=d;
	this.left=null;
	this.right=null;
	this.root=null;
}
	
public static treeimplement tree(treeimplement root) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter data ");
	int data=s.nextInt();
	root=new treeimplement(data);
	
	if(data==-1){
		return null;
	}
	System.out.println("insertying data in left side of node :-"+data);
	root.left=tree(root.left);
	
	System.out.println("insertying data in right side of node :-"+data);
	root.right=tree(root.right);
	
	return root;
}


	public static void main(String[] args) {
		root=tree(root);
		
	}

}
