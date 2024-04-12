package Strings;
import java.util.Arrays;
public class ReplaceAllDigitswithCharacters {

	public static void main(String[] args) {
		String s="a1c1e1";
		char[]ch=s.toCharArray();
		for(int i=1; i<s.length(); i++) {
				if(i%2!=0) {
					int j = s.charAt(i)-'0';
					ch[i]=(char)(ch[i-1] + j);
				}
		}	
		System.out.println(String.valueOf(ch));
	}

}
