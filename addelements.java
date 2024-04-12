package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class addelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> str=new LinkedList<String>();
		 System.out.println("Initial list of elements: "+str); 
		str.add("anil");
		str.add("pinki");
		str.add("gosu");
		str.add("yash");
		str.add("deepak");
		
		System.out.println("After invoking add(E e) method: "+str);  
		 
//Adding an element at the specific position  	
		 str.add(3, "Gaurav");
		 System.out.println("After invoking add(int index, E element) method: "+str);  

		 
		 
		 LinkedList<String> str2=new LinkedList<String>();  
		 str2.add("Sonoo");  
         str2.add("Hanumat");
         
//Adding second list elements to the first list    
         str.addAll(str2); 
         System.out.println("After invoking addAll(Collection<? extends E> c) method: "+str);
         
         
         LinkedList<String> str3=new LinkedList<String>();  
         str3.add("John");  
         str3.add("Rahul"); 
         
//Adding third list elements to the first list at specific position  
         str.addAll(1, str3);   
         System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+str); 
         
//Adding an element at the first position  
         str.addFirst("Lokesh");  
         System.out.println("After invoking addFirst(E e) method: "+str);     

//Adding an element at the last position  
	    str.addLast("sanjay");  
	    System.out.println("After invoking addFirst(E e) method: "+str);     
	}	
	

}
