package Strings;

public class detectCapital {

	public static void main(String[] args) {
		String word = "flAg";
		boolean ans=false;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)>=65 && word.charAt(i)<=90) {
				ans=true;
			}
			else {
			ans=false;
			if(word.charAt(i)>=97 && word.charAt(i)<=122) {
				ans=true;
			}
			else {
			ans=false;
			break;
			}
			}
			
		}
System.out.println(ans);
	}

}
