package Strings;

public class checkAdjucent {

	public static void main(String[] args) {
		
		String password ="IloveLe3tcode!";
		boolean ans=false;
		
		int i=0; 
		int j=1;
		
		while(j<password.length()) {
			if(password.charAt(i)==password.charAt(j)) {
				ans=false;
				break;
			}
			else {
				ans=true;
			}
			i++;
			j++;
		
		}
		System.out.println(ans);

	}

}
