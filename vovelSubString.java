package Strings;
import java.util.Arrays;
public class vovelSubString {

	public static void main(String[] args) {
		String word = "cuaieuouac";
		String nstr="";
		int count=0;
		int sum=0;
		
		
		for(int i=0; i<word.length(); i++) {
			for(int j=i; j<word.length(); j++) {
				for(int k=i; k<=j; k++) {
					nstr=nstr+word.charAt(k);
				}
			if(nstr.contains("a") && nstr.contains("e") && nstr.contains("i") && nstr.contains("o") && nstr.contains("u")) {
					for(int m=0; m<nstr.length(); m++) {
						if(nstr.charAt(m)=='a' || nstr.charAt(m)=='e' ||nstr.charAt(m)=='i' ||nstr.charAt(m)=='o' ||nstr.charAt(m)=='u' ) {
							sum=sum+1;	
						}
					}
					if(sum==nstr.length()) {
						count=count+1;
						}
					sum=0;
				}
				nstr="";
			}	
	}
		System.out.println(count);	
	}
}

