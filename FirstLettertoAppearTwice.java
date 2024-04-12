package Strings;

public class FirstLettertoAppearTwice {

	public static void main(String[] args) {
		String s ="abccbaacz";
		int n=s.length();
		char str = ' ';
		int i=0;
		int j=1;
		int ind=n;
		
		while(i<n-1) {
			
		if(s.charAt(i)==s.charAt(j)) {
				if(j<ind) {
					ind=j;
					str=s.charAt(i);
				}
				i++;
                j =i+1;
				}
		else if(j == n-1){
	                i++;
	                j=i+1;
	            }
		else {
				j++;
		}
		}
		System.out.println(str);
	}

}
