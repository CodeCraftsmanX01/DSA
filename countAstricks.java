package Strings;

public class countAstricks {

	public static void main(String[] args) {
		String  s = "yo|uar|e**|b|e***au|tifu|l";
		int bcount=0;
		int ccount=0;
		
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='|') {
				bcount++;
			}
			if(s.charAt(i)=='*' && bcount%2==0) {
				ccount++;
			}
		}
		System.out.println(ccount);
		
	}

}
