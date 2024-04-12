package Strings;
import java.util.Arrays;
public class MergeStringsAlternately {

	public static void main(String[] args) {
		String word1="abc";
		String word2="pqrstuy";
		String st = "";
		int a = word1.length();
		int b = word2.length();
		
		
			if(a==b){
				for(int i=0;i<a;i++){
					st+=word1.charAt(i);
					st+=word2.charAt(i);

		        	}
		    	}
			
	
		else if(a>b){
		            for(int i=0;i<b;i++){
		                st+=word1.charAt(i);
		                st+=word2.charAt(i);
		            }
		            for(int i=b;i<a;i++){
		                 st+=word1.charAt(i);
		            }
		        }
			
			
			
		else{
		                for(int i=0;i<a;i++){
		                st+=word1.charAt(i);
		                st+=word2.charAt(i);
		            }
		            for(int i=a;i<b;i++){
		                 st+=word2.charAt(i);
		            }
		        }
		   
	        System.out.println(st);	
	}

}
