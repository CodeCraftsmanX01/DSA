package babbarleetcode;
import java.util.*;
import java.util.Arrays;

public class squareOfShorted {

	public static void main(String[] args) {
		int num[]= {13, 7, 6, 45, 21, 9, 101, 102 };
	
		Arrays.sort(num);
		
		
		
     for(int i=0; i<num.length; i++) {
    	 num[i]=num[i]*num[i];
    	  
     }
     System.out.println(Arrays.toString(num));
     
		
	}

}
