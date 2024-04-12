package stackandqueue;
import java.util.Stack;
public class BasicCalculator {

	public static void main(String[] args) {
		String s = " 30";
		
		Stack<Integer>st=new Stack<Integer>();
		Stack<Character>ch=new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
				ch.push(s.charAt(i));
			}
			if(s.charAt(i)!=' ' && s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!='*' && s.charAt(i)!='/'){
				int num=s.charAt(i)-48;
				st.push(num);
			}
		}
		if(ch.isEmpty()){
           // int n=Integer.parseInt(s);
            System.out.println(s);
        }
			
		while(!st.empty() && !ch.empty()) {
			int a=st.pop();
			int b=st.pop();
			char operand=ch.pop();

			if(operand=='/') {
				int ans=b/a;
				System.out.println(ans);
				st.push(ans);
			}
			else if(operand=='*') {
				int ans=a*b;
				st.push(ans);
			}
			else if(operand=='+') {
				int ans=a+b;
				st.push(ans);
			}
			else  {
				int ans=a-b;
				st.push(ans);
			}
			
		}
		System.out.println(st.pop());
	}

}
