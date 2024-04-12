package Strings;

public class strstr {

	public static void main(String[] args) {
		String haystack = "a";
		String needle = "a";
		String nstr="";
		int index[]=new int[haystack.length()];
		int m=0;
		int ans=0;
		if(needle.length()==0) {
			ans=-1;
		}
		//index of needle
		for(int i=0; i<=haystack.length(); i++) {
			for(int j=i; j<=haystack.length(); j++) {
				for(int k=i; k<j; k++) {
					nstr=nstr+haystack.charAt(k);
					if(nstr.equalsIgnoreCase(needle)) {
						index[m++]=i;
					}
				}
				System.out.println(nstr);
				nstr="";
			}
			
		}
		for(int i=0; i<index.length; i++) {
		if(index[i]==0) {
			ans=(-1);
			break;
		}
		else {
			ans=index[i];
			break;
		}
		}
		
		System.out.println(ans);
	}

}
