package Strings;
import java.util.Arrays;
public class removeduplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbacdcbc";
		char ch[]=s.toCharArray();

		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(s.charAt(i)==s.charAt(j)) {
					ch[j]=' ';
				
				}
			}	
		}
		System.out.println(Arrays.toString(ch));
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!=' ') {
			sb.append(ch[i]);
			}
		}
		System.out.println(sb);

		
	}
}
