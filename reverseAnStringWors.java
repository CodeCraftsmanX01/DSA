package Strings;
import java.util.Arrays;
public class reverseAnStringWors {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String word[]=s.split(" ");
		/*String a="";
		
		for(int i=0; i<word.length; i++) {
			String st1=" ";
			for(int j=0; j<word[i].length(); j++) {
				st1=word[i].charAt(j)+st1;
			}
			a=a+st1;
		}
		System.out.println(a.trim())*/
		
		
		StringBuilder arr = new StringBuilder();
		for(int i=0; i<word.length; i++){
            for(int j=word[i].length()-1; j>=0; j--){
                arr.append(word[i].charAt(j));
            }
            arr.append(" ");
	}
		System.out.println(arr.toString().trim());
	}


}
