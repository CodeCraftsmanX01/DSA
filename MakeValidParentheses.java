package stackandqueue;
import java.util.Stack;
public class MakeValidParentheses {

	public static void main(String[] args) {
		String s="lee(t(c)o)de)";
		
		char ch[]=s.toCharArray();
		
		Stack<Integer> st=new Stack();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='(') {
				st.push(i);
			}
			else if(ch[i]==')' && st.size()>0) {
				st.pop();
			}
			else if(ch[i]==')' && st.size()==0) {
				ch[i]=' ';
			}
		}
		
		while(st.size()>0){
			ch[st.pop()]=' ';
		}

		String str="";
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!=' ') {
				str=str+ch[i];
			}
		}
		System.out.println(str);
	}

}
