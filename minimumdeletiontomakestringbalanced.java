package stackandqueue;
import java.util.Stack;
public class minimumdeletiontomakestringbalanced {

	public static void main(String[] args) {
		String s = "aababbab";
		Stack<Character> st=new Stack<>();
		int delete=0;
		
		for(int i=0; i<s.length(); i++) {
			if(st.size()>0 && st.peek()=='b' && s.charAt(i)=='a') {
				st.pop();
				delete++;
			}
			else {
				st.push(s.charAt(i));
			}
		}
		System.out.println(delete);
	}

}
