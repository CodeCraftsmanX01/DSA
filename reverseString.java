package recursion;

public class reverseString {
	
	static String reverse(String str) {
		
		
		if(str.isEmpty()) {
			return str;
		}
		
		
		
		return reverse(str.substring(1))+str.charAt(0);  
		
	}

	public static void main(String[] args) {

		String str="anil recusrion is eazy";
		
		String ans=reverse(str);
		System.out.println(ans);
	}

}
