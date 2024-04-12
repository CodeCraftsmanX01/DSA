package stackandqueue;
import java.util.*;
public class backspacestringcompare {

	public static void main(String[] args) {
		String s = "a##c",t="#a#c";
		
		char ch1[]=s.toCharArray();
		char ch2[]=t.toCharArray();
		String str1="";
		String str2="";
		
		Stack<Character>st=new Stack<>();
		
		int i=0;
		while(i<ch1.length) {
			if(ch1[i]!='#') {
				st.push(ch1[i]);
			}
			else if(!st.isEmpty()){
						st.pop();
		                }
			i++;
		}
		while(!st.empty()) {
			str1=st.pop()+str1;
		}
		
		int j=0;
		while(j<ch2.length) {
			if(ch2[j]!='#') {
				st.push(ch2[j]);
			}
			else if(!st.isEmpty()){
						st.pop();
		                }
			j++;
		}
		while(!st.empty()) {
			str2=st.pop()+str2;
		}

		if(str1.equals(str2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
