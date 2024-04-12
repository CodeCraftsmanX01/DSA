package linkedlist;

public class SingllyLinkedList {
static Node head;
static Node tail;
static class Node{
		int data;
		Node next;
		Node tail;
		//constructor
		Node (int d){
			this.data=d;
			this.next=null;
			this.tail=null;
		}
	}


// insering node at head or start
	public void InsertAtHead(int newData) {
		Node newNode=new Node(newData);
		//Make next of new Node as head
		newNode.next=head;
		//Move the head to point to new Node
		head=newNode;
	}

//insert node at end or tail
	public void InsertAtEnd(int newData) {
		   //1.Allocate the Node &
		   //2.Put in the data
	       //3.Set next as null
		Node newNode=new Node(newData);
		//If the Linked List is empty, then make the new node as head
		if(head==null) {
			head=new Node(newData);
			return;
		}
		//This new node is going to be the last node, so make next of it as null
		 newNode.next=null;
		// Else traverse till the last node 
		 Node Last=head;
		 while (Last.next != null) {
		        Last = Last.next;
		 //Change the next of last node 
		 }
		 Last.next=newNode;
		 
		 return;
		 
	}
	
//insert node at midlle or after a given node
	public void InsertAtGivenPosition(Node index, int newData) {
		//Check if the given Node is null
		if (index == null) {
	        System.out.println(
	            "The given previous node cannot be null");
	        return;
	    }
		//Allocate the Node & Put in the data
		Node newNode=new Node(newData);
		newNode.next=index.next;
		index.next=newNode;
		
	}
	
// Delete a node
	public void deleteANode(int position) {
	    if (head == null)
	      return;

	    Node temp = head;

	    if (position == 0) {
	      head = temp.next;
	      return;
	    }
	    // Find the key to be deleted
	    for (int i = 0; i < position - 1; i++)
	      temp = temp.next;

	    // If the key is not present
	    if (temp == null || temp.next == null)
	      return;

	    // Remove the node
	    Node next = temp.next.next;

	    temp.next = next;
	  }
	
	
// Search a node
	public boolean searchaNode(int value) {
	    Node current = head;
	    while (current != null) {
	      if (current.data == value) {
	        return true;
	      }
	      current = current.next;
	    }
	    return false;
	  }
	  
	  
// Sort the linked list
	public void sortLinkedList(Node head) {
	    Node current = head;
	    Node index = null;
	    int temp;

	    if (head == null) {
	      return;
	    }
	    else {
	      while (current != null) {
	        // index points to the node next to current
	        index = current.next;

	        while (index != null) {
	          if (current.data > index.data) {
	            temp = current.data;
	            current.data = index.data;
	            index.data = temp;
	          }
	          index = index.next;
	        }
	        current = current.next;
	      }
	    }
	  }

	  
//traversing linkedlist
	public void printList(){
		    Node n = head;
		    while (n != null) {
		        System.out.print(n.data + "->");
		        n = n.next;
		    }
		    System.out.println("END");
		}
		
		
		
		
		
	public static void main(String[] args) {
		SingllyLinkedList llist=new SingllyLinkedList();
		
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		llist.tail=new Node(5);
		
		
		llist.head.next=second;
		second.next=third;
		third.next=tail;
	

		llist.InsertAtHead(10);
		llist.InsertAtHead(20);
		llist.InsertAtHead(30);
		llist.printList();
		System.out.println();
		
		llist.InsertAtEnd(20);
		llist.InsertAtEnd(30);
		llist.InsertAtEnd(40);
		llist.printList();
		System.out.println();
		
		llist.InsertAtGivenPosition(third, 46);
		llist.InsertAtGivenPosition(second, 1111);
		llist.printList();
		System.out.println();
		
		llist.deleteANode(4);
		llist.deleteANode(0);
		llist.deleteANode(8);
		llist.printList();
		System.out.println();
		
		llist.sortLinkedList(second);
		llist.printList();
		System.out.println();
		
		boolean ans=llist.searchaNode(46);
		System.out.println(ans);
		
//to find length of linkedlist		
		 Node n = head;
		 int count=0;
		    while (n != null) {
		        count++;
		        n = n.next;
		    }
		    System.out.println(count);
		
	}

}
