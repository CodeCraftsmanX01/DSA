package linkedlist;


public class mergeTwosotedList {
	private Node head;
	private Node tail;
	private int size;
	public mergeTwosotedList() {
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
	
	public mergeTwosotedList mergetwoList(mergeTwosotedList L1, mergeTwosotedList L2) {
		Node List1=L1.head;
		Node List2=L2.head;
		Node ans=new Node();
		
		
		mergeTwosotedList ans=new mergeTwosotedList();
		while(List1!=null && List2!=null) {
			if(List1.val<List2.val) {
				
			}
		}
		return L2;
		
		
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
		mergeTwosotedList L1 =new mergeTwosotedList();
		
		L1.Insertelement(900);
		L1.Insertelement(800);
		L1.Insertelement(700);
		L1.Insertelement(600);
		L1.Insertelement(400);
		L1.Insertelement(200);
		
		//LL.display();
		
		L1.display();
mergeTwosotedList L2 =new mergeTwosotedList();
		
		L2.Insertelement(700);
		L2.Insertelement(600);
		L2.Insertelement(500);
		L2.Insertelement(500);
		L2.Insertelement(300);
		L2.Insertelement(100);
		
		//LL.display();
		
		L2.display();

	}

}
