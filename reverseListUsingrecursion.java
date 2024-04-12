package linkedlist;


public class reverseListUsingrecursion {
	static Node head;
	static Node tail;
	static class Node{
			String data;
			Node next;
			Node tail;
			//constructor
			Node (String d){
				this.data=d;
				this.next=null;
				this.tail=null;
			}
		}
//inserting elements
	static void push(String data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
	
	
//reversing linked list using recursion
	public void reverse(Node node) {
		if(node==tail) {
			head=tail;
			return;
		}
		reverse(node.next);
		
		tail.next=node;
		tail=node;
		tail.next=null;
	}
//printing elements	 
		static void print()
	    {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
SingllyLinkedList llist=new SingllyLinkedList();
		
		Node head=new Node("anil");
		Node second=new Node("mummy");
		Node third=new Node("papa");

	    print();
	    

	}

}
