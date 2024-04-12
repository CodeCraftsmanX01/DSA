package Strings;
import java.util.Arrays;
public class lengthOfLastWord {

	public static void main(String[] args) {
		String s="luffy is still joyboy   ";
		String[] ch=s.split(" ");
		int i=ch.length-1;
		int length=ch[i].length();
		System.out.println(length);
		
		
	}

}
