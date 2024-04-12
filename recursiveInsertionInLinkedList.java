package linkedlist;

import java.util.LinkedList;

import linkedlist.SingllyLinkedList.Node;

public class recursiveInsertionInLinkedList {
	static int size=0;
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
			public Node(int data2, Node node) {
				// TODO Auto-generated constructor stub
			}
		}
	
	//inserting elenet using recursion
	public Node insertRec(int index, int data, Node node) {
		if(index==0) {
			Node temp=new Node(data, node);
			size++;
			return temp;
		}
		
		insertRec(index--, data, node.next);
		return node;
	}
	
	
	//priting elements
	public void print() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		recursiveInsertionInLinkedList llist=new recursiveInsertionInLinkedList();
		
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(5);
		
		
		llist.head.next=second;
		second.next=third;
		third.next=fourth;
		
		llist.print();
		llist.insertRec(88, fourth);
		llist.print();
		
	}

}
