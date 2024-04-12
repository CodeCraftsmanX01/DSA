package linkedlist;

import java.util.LinkedList;

public class removeElements {

	public static void main(String[] args) {
		LinkedList <String> str=new LinkedList<String>();
		str.add("anil");
		str.add("pinki");
		str.add("papa");
		str.add("mummy");
		str.add("gosu");
		str.add("yash");
		str.add("deepak");
		str.add("pinki");
		str.add("pinki");
		
		  System.out.println("Initial list of elements: "+str);  

//Removing specific element from arraylist  
          str.remove("papa");  
          System.out.println("After invoking remove(object) method: "+str);   
		  
//Removing element on the basis of specific position  
          str.remove(4);  
          System.out.println("After invoking remove(index) method: "+str);   		
         
          LinkedList<String> str2=new LinkedList<String>();  
          str2.add("Ravi");  
          str2.add("Hanumat");  
          
// Adding new elements to first list  
          str.addAll(str2);  
          System.out.println("Updated list : "+str);   
     
//Removing all the new elements from arraylist  
          str.removeAll(str2);  
          System.out.println("After invoking removeAll() method: "+str);   
          
//Removing first element from the list  
          str.removeFirst();  
          System.out.println("After invoking removeFirst() method: "+str);  
       
//Removing first occurrence of element from the list  
          str.removeFirstOccurrence("pinki");  
          System.out.println("After invoking removeFirstOccurrence() method: "+str); 
          
//Removing last occurrence of element from the list  
          str.removeLastOccurrence("pinki");  
          System.out.println("After invoking removeFirstOccurrence() method: "+str); 
	
//Removing all the elements available in the list       
          str.clear();  
          System.out.println("After invoking clear() method: "+str);   
	}

}
