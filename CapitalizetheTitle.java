package Strings;
import java.util.Arrays;
public class CapitalizetheTitle {

	public static void main(String[] args) {
		String title ="i lOve leetcode";
		String nstr="";
		
		if(title.length()>1) {
			title=title.toLowerCase();
			String word[]=title.split(" ");

			
			for(int i=0; i<word.length; i++) {
				String ch[]=word[i].split("");
				if(word[i].length()==1 || word[i].length()==2) {
					nstr=nstr+" "+word[i].toLowerCase();
				}
				else {
				nstr=nstr+" "+ch[0].toUpperCase();
				for(int j=1; j<ch.length; j++) {
					nstr=nstr+ch[j];
				}
				}
			}
		}
		else {
			title=title.toLowerCase();
			nstr=nstr+title;
		}
		
		
		System.out.println(nstr.trim());
	}

}
