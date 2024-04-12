package Strings;
import java.util.Arrays;
public class commonWordsWithOneOccurence {

	public static void main(String[] args) {
		String [] words1 = {"a","ab"};
		String [] words2 = {"a","a","a","ab"};
		int count=0;
		
		/*for(int i=0; i<words1.length; i++) {
			for(int j=i+1; j<words1.length; j++) {
				if(words1[i].equals(words1[j])) {
					words1[i]=" ";
				
				}
			}
		}
		System.out.println(Arrays.toString(words1));
		for(int i=0; i<words2.length; i++) {
			for(int j=i+1; j<words2.length; j++) {
				if(words2[i].equals(words2[j])) {
					words2[i]=" ";
					words2[j]=" ";
				}
			}
		}*/
		//System.out.println(Arrays.toString(words2));
		
		for(int i=0; i<words1.length; i++) {
			for(int j=i+1;j<words2.length; j++) {
				if(words1[i].equals(words2[j]) && words1[i]!=words2[i]) {
				
					count=count+1;
				}
			}
		}
		System.out.println(count);
	}

}
