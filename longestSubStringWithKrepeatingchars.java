package Strings;

public class longestSubStringWithKrepeatingchars {

	public static void main(String[] args) {
		String s = "ababbc";
		int k = 2;
		String nstr="";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++){
				for(int l=i; l<=j; l++){
					nstr=nstr+s.charAt(l);
					}
				System.out.println(nstr);
				
				for(int m=0; m<nstr.length(); m++) {
					int count=0;
					for(int n=0; n<nstr.length(); n++) {
						if(nstr.charAt(m)==nstr.charAt(n)) {
							count++;
							
							if(count>=k) {
							sb.append(nstr.charAt(m));	
							}
						}
					}
				}
				
				nstr="";
				}
			}

	}

}
