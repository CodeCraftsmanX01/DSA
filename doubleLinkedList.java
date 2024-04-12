package linkedlist;

import linkedlist.SingllyLinkedList.Node;

public class doubleLinkedList {
	static Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		
		Node (int d){
			data=d;
			next=null;
			prev=null;
		}
	}
	
	
	
	
// insert first
	public void InsertFirst(int data) {
		Node newnode= new Node(data);
		
		newnode.next=head;
		newnode.prev=null;
		if(head!=null) {
			head.prev=newnode;
		}
		head=newnode;
	}
	
	
// insert at last
	public void Insertatlast(int data) {
		Node newnode=new Node(data);
		Node last=head;
		
		//newnode.next=null;
		//if(head==null) {
		//	newnode.prev=null;
		//	head=newnode;
		//	return;
		//}
		
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newnode;
		newnode.prev=last;
		
	}
	
//insert at middle
	public void Insertatmiddle(Node index,int data) {
		//Check if the given Node is null
				if (index == null) {
			        System.out.println(
			            "The given previous node cannot be null");
			        return;
			    }
				//Allocate the Node & Put in the data
				Node newNode=new Node(data);
				newNode.next=index.next;
				index.next=newNode;
	}
	
	
//traversing list	
	public void printList(){
	    Node n = head;
	    while (n != null) {
	        System.out.print(n.data + "->");
	        n = n.next;
	    }
	    System.out.println("END");
	    
	}
//traversing list in reverse	
	public void printListRev(){
	    Node n = head;
	    Node last=null;
	   
	    while(last!=null) {
	    	System.out.println(last.data + "<-");
	    	last=last.prev;
	    }
	    System.out.println("START");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleLinkedList llist=new doubleLinkedList();
		
		llist.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		
		llist.head.next=second;
		second.next=third;
		
		
		llist.InsertFirst(100);
		llist.InsertFirst(200);
		llist.printList();
		llist.printListRev();
		
		llist.Insertatlast(400);
		llist.Insertatlast(500);
		llist.printList();
	
		llist.Insertatmiddle(third, 900);
		llist.Insertatmiddle(second, 1000);
		llist.printList();
	}

}
