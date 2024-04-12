package Strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "a";
		String n=s.toLowerCase();
		String nstr="";
		boolean ans=false;
		String count= "1234567890";
		for(int i=0; i<n.length(); i++) {
			for(int k=0; k<count.length(); k++) {
			if(n.charAt(i)>=97 && n.charAt(i)<=122 ||n.charAt(i)==count.charAt(k)) {
				nstr=nstr+n.charAt(i);
			}
			if(nstr.isEmpty() ||nstr.length()==1) {
				ans=true;
			}
		}
		}
		//to check palindrome
		int i=0; 
		int j=nstr.length()-1;
		while(i<j) {
			if(nstr.charAt(i)!=nstr.charAt(j)) {
				ans=false;
			}
			
			i++;
			j--;
		}
		System.out.println(ans);
	}

}
