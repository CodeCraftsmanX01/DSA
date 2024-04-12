package Strings;

public class largestOddNo {

	public static void main(String[] args) {
		String num = "11121";
		int index=0;
		String n="";
		int count=0;
		for(int m=0;m<num.length(); m++) {
			if(num.charAt(m)%2==0) {
				count++;
			}
			}
		if(count==num.length()) {
			n="";
			}
		else {
		for(int i=0; i<=num.length(); i++) {
				for(int j=i; j<num.length(); j++) {
					if(num.charAt(j)%2!=0) {
					if(j>index) {
						index=j;
						}
					}
				}
				for(int k=i; k<=index; k++) {
						n=n+num.charAt(k);
					}
				break;
			
			}

			
		}
		System.out.println(n);
	}

	
}
