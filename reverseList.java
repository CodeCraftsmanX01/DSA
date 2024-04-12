package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class reverseList {
	static Node head;
	 
    static class Node {
 
        String data;
        Node next;
 
        Node(String d)
        {
            data = d;
            next = null;
        }
    }
    
    
    
    
    
//inserting elements
    static void push(String data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    
 //reversing elements   
	public static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
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
		
		
		 	push("anil");
		    push("pinki");
		    push("papa");
		    push("mummy");
		    
		    print();
		    
		    head = reverse(head);
		    print();

	}

}
