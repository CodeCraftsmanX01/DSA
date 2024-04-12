package stackandqueue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class reverseFirstkofQueue {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
	//pop first k elements and push into stack	
		int k=3;
		Stack<Integer> st=new Stack<>();
		for(int i=0; i<k; i++) {
			int val=q.peek();
				q.remove();
				st.push(val);
			
		}
	
	//fetch from stack and push into queue
		while(!st.empty()) {
			int val=st.peek();
			st.pop();
			q.add(val);
			}
	
	//fetch first n-k elements from q and push back
		int t=q.size()-k;
		while(t!=0) {
			int val=q.peek();
			q.remove();
			q.add(val);
			
			t--;
		}
		System.out.println(q);
	
	
	}
}
