package Strings;
import java.util.Arrays;
public class reverseOnlyVowels {

	public static void main(String[] args) {
		String s = "leetcode";
		char ch[]=s.toCharArray();
		int i=0; int j=s.length()-1;
		 String check = "aeiouAEIOU";
		
			while(i < j){
	            if(i < j && check.indexOf(ch[i]) == -1){
	                i++;
	            }
	            
	            while(i < j && check.indexOf(ch[j]) == -1){
	                j--;
	            }
	            
	            char temp = ch[i];
	            ch[i]=ch[j];
	            ch[j]=temp;
	            i++;
	            j--;
	        }
		String str=new String(ch);
		System.out.println(str);
	}

}
