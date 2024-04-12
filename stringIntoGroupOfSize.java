package Strings;

import java.util.Arrays;

public class stringIntoGroupOfSize {

	public static void main(String[] args) {
		String s = "abcdefghijlmn";
		int k = 3;
		char fill = 'x';
		String nstr="";
		int index=0;
		String result[];
		int res=s.length()%k;
		
		if(res==0) {
			 result=new String[s.length()/k];
		for(int i=0; i<s.length(); i=i+k) {
			for(int j=i; j<i+k; j++) {
				nstr=nstr+s.charAt(j);
			}
			result[index++]=nstr;
			nstr="";
			
		}
		}
		else {
				result=new String[s.length()/k+1];
			for(int i=0; i<s.length()-res; i=i+k) {
				for(int j=i; j<i+k; j++) {
					nstr=nstr+s.charAt(j);
				}
				result[index++]=nstr;
				nstr="";
			}
			int count=k-res;
			for(int i=s.length()-res; i<s.length(); i++) {
				nstr=nstr+s.charAt(i);
			}
			for(int j=0; j<count; j++) {
				nstr=nstr+fill;
				}
			result[index]=nstr;
		}
		System.out.println(Arrays.toString(result));
	}

}
