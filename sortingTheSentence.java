package Strings;
import java.util.Arrays;
public class sortingTheSentence {

	public static void main(String[] args) {
String s = "is2 sentence4 This1 a3";

String str[]= {" "};


String[]word=s.split(" ");
String str2[]=new String[word.length];
System.out.println(Arrays.toString(word));


for(int i=0; i<word.length; i++) {
	if(word[i].charAt(word[i].length()-1)==2) {
		str2[2]=word[i];
	}




}
System.out.println(Arrays.toString(str2));

	}
	
	
	
	}

