package linkedlist;
//similar to singlelist
//in circular no node has next as null beacuse head and tail are also connected			


public class circularLinkedList {
		private Node head;
		private Node tail;
		public circularLinkedList() {
			this.head=null;
			this.tail=null;
		}
		static class Node{
			int data;
			Node next;
			
			Node (int d){
				this.data=d;
				}
			
			}
		
		
		
//insert element
		public void InsertFirst(int data) {
			Node newnode= new Node(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
				return;
			}
			
			tail.next=newnode;
			newnode.next=head;
			tail=newnode;
		
		}
//	deleting an element
		public void deleteElement(int data) {
			Node node=head;
			if(node==null) {
				return;
			}
			if(node.data==data) {
				head=head.next;
				tail.next=head;
				return;
			}
			do {
				Node n=node.next;
				if(n.data==data) {
					node.next=n.next;
					break;
				}
				node=node.next;
			}while(node!=head);
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
		
	public static void main(String[] args) {
		circularLinkedList  llist=new circularLinkedList ();
		
		llist.head=new Node(10);
		Node second=new Node(100);
		Node third=new Node(1000);
		
		llist.head.next=second;
		second.next=third;
		
		llist.printList();
		llist.deleteElement(100);
		llist.printList();
		
		llist.InsertFirst(10000);
		llist.printList();
		

	}

}
