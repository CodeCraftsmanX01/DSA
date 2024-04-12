package linkedlist;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	public LL() {
		this.size=0;
	}
	
	class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val=val;
			}
		
		public Node(int val, Node next) {
			this.val=val;
			this.next=next;
		}
	}
	
	public void InsertAtFirst(int val) {
		Node newNode=new Node(val);
		newNode.next=head;
		head=newNode;
		
		if(tail==null) {
			tail=head;
		}
		size++;
	}
	
	public void InsertAtlast(int val) {
		Node newNode=new Node(val);
		if(tail==null) {
			InsertAtFirst(val);
			return;
		}
		
		tail.next=newNode;
		newNode.next=null;
		tail=newNode;
		size++;
	}
	
	public void InsertAtMiddle(int val, int index) {
		Node temp=head;
		for(int i=0; i<index-1; i++) {
			temp=temp.next;
		}
		Node newNode=new Node(val, temp.next);
		temp.next=newNode;
		size++;
	}
	
	public int deleteAtFirst() {
		int value=head.val;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return value;
	}
	
	
	public int deleteAtlast() {
		int value=tail.val;
		Node temp=head;
		for(int i=0; i<size-2; i++) {
			temp=temp.next;
		}
		
		temp.next=null;
		size--;
		return value;
	}
	
	public void deletAtMiddle(int index) {
		Node temp=head;
		for(int i=0; i<index-1; i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
	
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	public static void main(String[] args) {
		LL list=new LL();
		list.InsertAtFirst(40);
		list.InsertAtFirst(30);
		list.InsertAtFirst(20);
		list.InsertAtFirst(10);
		list.print();
		list.InsertAtlast(50);
		list.InsertAtlast(60);
		list.InsertAtlast(70);
		list.print();
		
		list.InsertAtMiddle(100, 2);
		list.print();
		
		list.deleteAtFirst();
		list.print();
		list.deleteAtlast();
		list.print();
		list.deletAtMiddle(2);
		list.print();
	}

}
