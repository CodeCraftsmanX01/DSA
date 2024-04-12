package Arrays;

public class concatinateTwoStringElement {
	 static boolean concat(String[]word1, String[] word2, 	boolean check) {
		
		
		String sum1="";
		String sum2="";
	
		
		for(int i=0; i<word1.length; i++) {
			sum1=sum1+word1[i];
		}
		System.out.println(sum1);
		
		for(int i=0; i<word2.length; i++) {
			sum2=sum2+word2[i];
		}
		System.out.println(sum2);
		
		if(sum1.toCharArray()==sum2.toCharArray())
			check=true;
	 
	 
	return check;
	}
	public static void main(String[] args) {
		String[] word1 = {"a", "cb"};
		String[] word2 = {"ab", "c"};
		boolean check=false;
		
		
		boolean ans=concat(word1, word2, check);
		System.out.println(ans);
		
	}
		
		}

	
	
