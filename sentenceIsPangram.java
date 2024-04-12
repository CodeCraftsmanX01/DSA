package Strings;
import java.util.Arrays;
public class sentenceIsPangram {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		char ch[]=sentence.toCharArray();
		boolean ans=false;
		int count=0;
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					ch[j]='0';
				}
			}
			if(ch[i]!='0') {
				count++;
				if(count==26) {
					ans=true;
				}
			}
		}
	
	
		System.out.println(ans);
	}

}
