package stackandqueue;
import java.util.Stack;
public class removeAllAdjacentDupliucates {

	public static void main(String[] args) {
		String s = "azxxzy";
		char[] ch=s.toCharArray();
		Stack<Character> st=new Stack<>();

		for(int i=0;i<ch.length; i++) {
			char x=ch[i];
			if(st.size()>0 && st.peek().equals(x)) {
				st.pop();
			}
			else {
				st.push(x);
			}
		}
		
		String str="";
		while(!st.empty()) {
			str=st.pop()+str;
		}
		
		System.out.println(str);
	}

}
