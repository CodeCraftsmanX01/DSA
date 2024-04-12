package stackandqueue;
import java.util.Stack;
public class reverseStringusingStack {

	public static void main(String[] args) {
		String str="babbar";
		String ans="";
		Stack<Character> st = new Stack<>();
		int i=0;
		 for(i = 0; i < str.length(); i++) {
	            st.push(str.charAt(i));
	        }

	        for(i = 0; i < str.length(); i++) {
	            ans =ans+ st.pop();
	        }
		
		System.out.println(ans);

	}

}
