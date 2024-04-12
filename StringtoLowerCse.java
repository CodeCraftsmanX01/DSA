package Strings;
import java.util.Arrays;
public class StringtoLowerCse {

	public static void main(String[] args) {
		String s = "Hello";
		char []ch=s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=65 && ch[i]<=90)
				ch[i]+=32;
		}
		System.out.println(ch);
	}

}
