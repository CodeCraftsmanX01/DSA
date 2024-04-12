package linkedlist;

import linkedlist.LL.Node;

public class swapNodesinPair {
	private Node head;
	private Node tail;
	private int size;
	public swapNodesinPair() {
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
	
	//insert elements
	public void insertatfirst(int val) {
		Node newNode=new Node(val);
		
		newNode.next=head;
		head=newNode;
		if(tail==null) {
			tail=head;
		}
	}
	
	
	//swap nodes in pair
	public Node swap(Node head) {
		
		Node first=head;
		Node second =head.next;
		
		while(first.next.next!=null) {
			int temp=first.val;
			first.val=second.val;
			second.val=temp;
			
			
			first=first.next.next;
			second=second.next.next;
		}
		
		
		return head;
	}
	//print
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		swapNodesinPair list=new swapNodesinPair();
		list.insertatfirst(10);
		list.insertatfirst(20);
		list.insertatfirst(30);
		list.insertatfirst(40);
		
		list.print();
		
		list.swap(null);
		list.print();

	}

}
