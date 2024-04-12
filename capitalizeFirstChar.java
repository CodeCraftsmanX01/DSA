package Strings;
import java.util.Arrays;
public class capitalizeFirstChar {
	public static void main(String[] args) {
		String title ="capiTalIze tHe titLe";
		
		String nstr=" "+title;
		String n="";
		
		if(title.length()>1) {
			nstr=nstr.toLowerCase();
			char ch[]=nstr.toCharArray();
			for(int i=0; i<ch.length; i++) {
				if(ch[i]==' ') {
					i++;
					n=n+ch[i];
					n.toUpperCase();
					
					;
				}
				else {
					n=n+ch;
				}
			}
			}
		
		System.out.println(n.trim());
	}
}
