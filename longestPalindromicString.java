package Strings;

public class longestPalindromicString {

	public static void main(String[] args) {
		String s = "aacabdkacaa";
		String nstr="";
		String length="";
		String longest="";
		
		for(int i=0; i<=s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				for(int k=i; k<=j; k++) {
					
				nstr=nstr+s.charAt(k);
				//System.out.println(nstr);
					int l=0; int m=nstr.length()-1;
					while(l<=m) {
					
						if(nstr.charAt(l)==nstr.charAt(m)) {
							
							length=nstr;
							System.out.println(nstr);
							if(longest.length()<length.length()) {
								longest=length;
							}
						}
						else {
							length="";
							break;

						}
						
						l++;
						m--;
					}
				}
				nstr="";
			}
			
			
		}

		System.out.println(longest);
			
		}
		
	
	}

