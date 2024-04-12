package Strings;
import java.util.Arrays;
public class SwapCanMakeStringsEqual {

	public static void main(String[] args) {
	String	 s1 ="kelb", s2 = "kelb";
	char ch[]=s1.toCharArray();
	boolean ans=false;
	
	for(int i=0; i<ch.length; i++) {
		for(int j=0; j<ch.length; j++) {
			//swap
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			
			String str=new String(ch);
			if(str.equals(s2)) {
				ans=true;
			}
				ch=s1.toCharArray();
			
		}
		
	}
	System.out.println(ans);
	}

}
