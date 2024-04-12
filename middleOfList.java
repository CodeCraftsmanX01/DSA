package linkedlist;

public class middleOfList {
	private Node head;
	private Node tail;
	private static int size;
	public middleOfList() {
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
	
	public void Insertelement(int val) {
		Node newNode=new Node(val);
		newNode.next=head;
		head=newNode;
		size++;
		
	}
	
	public Node middle(int size) {
		
		Node temp=head;
		int mid=size/2;
		while(mid!=0) {
			temp=temp.next;
			mid--;
		}
		return temp;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	public static void main(String[] args) {
middleOfList L1 =new middleOfList();
		
		L1.Insertelement(900);
		L1.Insertelement(800);
		L1.Insertelement(700);
		L1.Insertelement(600);
		L1.Insertelement(400);
		L1.Insertelement(200);
		//LL.display();
		L1.display();
		
		System.out.println(size);
		L1.middle(size);
		L1.display();
		
	}

}
