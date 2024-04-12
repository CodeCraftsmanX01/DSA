package Strings;
import java.util.Arrays;
public class ReversePrefixofWord {

	public static void main(String[] args) {
		String word = "wxyzw";
		String ch="d";
		String str="";
		if(word.contains(ch)) {
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==ch.charAt(0)) {
				for(int j=0; j<=i; j++) {
					str=word.charAt(j)+str;
				}
				for(int k=i+1; k<word.length(); k++) {
					str=str+word.charAt(k);
					}
				
				break;
			}	
		}
		}
		else {
			str=word;
		}
		System.out.println(str);
	}

}
