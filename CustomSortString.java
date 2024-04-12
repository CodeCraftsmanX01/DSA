package Strings;
import java.util.Arrays;
public class CustomSortString {

	public static void main(String[] args) {
	String order = "cba", s = "abcde";
	char ch[]=s.toCharArray();
	/*int k=0;
	String output="";
	for(int i=0; i<ch.length; i++) {
		for(int j=0; j <ch.length; j++) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			
			String str=new String(ch);
			
			while(k<order.length()) {
				if(order.charAt(k)==str.charAt(k)) {
					output=str;
				}
				
				k++;
			}
			ch=s.toCharArray();
		}
	}
System.out.println(output);*/
	
	char character[]=new char[s.length()];
	StringBuilder sb=new StringBuilder();
	int i=0;
	while(i<order.length()) {
			for(int k=0; k<ch.length; k++) {
			for(int j=0; j<ch.length; j++) {
				char temp=ch[k];
				ch[k]=ch[j];
				ch[j]=temp;
				if(order.charAt(i)==ch[j]) {
					character[i]=order.charAt(i);
					sb.append(order.charAt(i));
				}
				break;
			}
			
		}
		
		i++;
	}
	String str=new String (sb);
		for(int l=0; l<s.length(); l++) {
			for(int m=0; m<character.length; m++) {
				
			}
		}
	System.out.println(str);
	
	System.out.println(Arrays.toString(character));
	}

}
