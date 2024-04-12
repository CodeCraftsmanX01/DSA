package Strings;
import java.util.Arrays;
public class uniqueCharInString {

	public static void main(String[] args) {
		String s = "leetcode";
		
		int index=-1;
		int count=0;
	
		for(int i=0; i<s.length(); i++) {
			count=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count=count+1;
				}
			}
			if(count==1) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	

	}

}
