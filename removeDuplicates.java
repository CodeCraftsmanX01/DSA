package stackandqueue;
import java.util.*;
public class removeDuplicates {

	public static void main(String[] args) {
		String s = "cbacdcbc";
		int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) -97] = i;// track the lastIndex of character presence
        
        }
        
        boolean[] seen = new boolean[26]; // keep track seen
        Stack<Integer> st = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 97;
            
            if (seen[curr]==true) {
            	continue; // if seen continue as we need to pick one char only
            }
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
                seen[st.pop()] = false; // pop out and mark unseen
            }
            st.push(curr); // add into stack
            seen[curr] = true; // mark seen
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append((char) (st.pop() + 97));
        String str= sb.reverse().toString();
		System.out.println(str);
	}
}
