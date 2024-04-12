package Strings;
import java.util.Arrays;
public class commonwordWithsingleOccurence {

	public static void main(String[] args) {
		String [] words1 = {"leetcode","is","amazing","as","is"};
		String [] words2 = {"amazing","leetcode","is"};
	

		StringBuilder s1=new StringBuilder();
		StringBuilder s2=new StringBuilder();
		for(int i=0; i<words1.length; i++) {
			int count=0;
			for(int j=0; j<words1.length; j++) {
				if(words1[i]==words1[j]) {
					count=count+1;
				}
			}
			if(count<=1) {
				s1.append(words1[i]+" ");
			}
			
		}
		String out1 = s1.toString();
		String str1[]=out1.split(" ");
		System.out.println(Arrays.toString(str1));
	
		for(int i=0; i<words2.length; i++) {
			int count=0;
			for(int j=0; j<words2.length; j++) {
				if(words2[i]==words2[j]) {
					count=count+1;
				}
			}
			if(count<=1) {
				s2.append(words2[i]+" ");
			}
		}
		String out2 = s2.toString();
		String str2[]=out2.split(" ");
		System.out.println(Arrays.toString(str2));
		int count=0;
		for(int i=0; i<str1.length; i++) {
			for(int j=0; j<str2.length; j++) {
				if(str1[i].equals(str2[j])) {
					count=count+1;
				}
			}
			
		}
		
		System.out.println(count);
	}

}
