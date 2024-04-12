package Strings;

public class AllAAppearsBeforeAllB {

	public static void main(String[] args) {
		String s ="abab";
		char ch[]=s.toCharArray();
		boolean ans=false;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!='a') {
				ans=true;
			}
		}
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!='b') {
				ans=true;
			}
		}
		for(int i=0; i<ch.length-1; i++) {
			if(ch[i]=='b' && ch[i+1]=='a') {
				ans=false;;
			}
		}
System.out.println(ans);
	}

}
