package Strings;

public class makeStringValid {

	public static void main(String[] args) {
		String s ="()))((";
		System.out.println(s);
		
		int closepar=0;
		int extrapar=0;
		
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='(') {
					closepar++;
				}
				else {
					if(closepar==0) {
					extrapar++;
					}
					else {
						closepar--;
					}
				}
			}
	System.out.println(extrapar);
	System.out.println(closepar);
	System.out.println(Math.abs(extrapar+closepar));
	
	
	
	}
	

}
