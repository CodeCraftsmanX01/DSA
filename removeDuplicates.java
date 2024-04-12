package linkedlist;


public class removeDuplicates {

	private Node head;
	private Node tail;
	private int size;
	public removeDuplicates() {
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
		
		
	}
	
	public void removesame() {
		
		Node temp=head;
		while(temp.next!=null) {
			if(temp.val==temp.next.val) {
				temp.next=temp.next.next;
			}
			else {
				temp=temp.next;
			}
		}
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
		removeDuplicates LL =new removeDuplicates();
		
		LL.Insertelement(500);
		LL.Insertelement(500);
		LL.Insertelement(400);
		LL.Insertelement(300);
		LL.Insertelement(200);
		LL.Insertelement(200);
		
		//LL.display();
		LL.removesame();
		LL.display();
	}

}
