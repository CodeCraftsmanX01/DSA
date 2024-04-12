package Strings;
import java.util.Arrays;
public class truncateSentence {

	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		String[]str2=s.split(" ");
		int k=4;
		String str=" ";
		for(int i=0; i<4; i++) {
			str=str+str2[i]+" ";
			
		}
		System.out.println(str.trim());
	}

}
