package Strings;
import java.util.Arrays;
public class MakeAlternatingBinaryString {

	public static void main(String[] args) {
		String s ="0100";
		char ch[] = s.toCharArray();
		int one=0;
		int zero=0;
       //if first digit is 1
    
    	   for(int i=0; i<ch.length; i=i+2) {
    		   if(ch[i]=='0') {
    		   one++;
    		   }
    	   }
    	  for(int j=1; j<ch.length; j=j+2) {
    		  if(ch[j]=='1') {
       		  one++;
       		   } 
    	  }
       //if first digit is 0
       
    	   for(int i=0; i<ch.length; i=i+2) {
    		   if(ch[i]=='1') {
    		   zero++;
    		   }
    	   }
    	   for(int j=1; j<ch.length; j=j+2) {
     		  if(ch[j]=='0') {
        		   zero++;
        		   } 
     	  }
       
       if(one<zero) {
    	   System.out.println(one);
       }
       else {
    	   System.out.println(zero);
       }
   	
	}

}
