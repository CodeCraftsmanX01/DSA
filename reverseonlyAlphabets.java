package Strings;
import java.util.Arrays;
public class reverseonlyAlphabets {

	public static void main(String[] args) {
		String s="a-bC-dEf-ghIj";
		char ch[]=s.toCharArray();
		int i=0; 
		int j=s.length()-1;
		
		while(i<=j) {
			if((ch[i]>=65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122) && (ch[j]>=65 && ch[j]<=90 || ch[j]>=97 && ch[j]<=122)) {
				
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			
				}
			else if(ch[i]>=65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122) {
				j--;
				}
			else if(ch[j]>=65 && ch[j]<=90 || ch[j]>=97 &&ch[j]<=122) {
				i++;
				}
			
			else {
				i++;
				j--;
				}
		}	
	
		String nstr=new String(ch);
		System.out.println(nstr);
	}

}
