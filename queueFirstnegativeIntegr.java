package stackandqueue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class queueFirstnegativeIntegr {

	public static void main(String[] args) {
		//solved using stack
		
/*		int arr[]= {-8,2,3,-6,10};
		int arr1[]=new int[arr.length-1];
		int k=2;
		
		Stack<Integer> st=new Stack<>();
		int i=0;
		
		while(i<arr.length-1) {
				st.push(arr[i]);
				st.push(arr[i+1]);
				
				int j=0;
				while(j<k) {
					int num=st.pop();
					if(num<0) {
						arr1[i]=num;
					}
					j++;
				}
				i++;
			}
		System.out.println(Arrays.toString(arr1));  */
		
		
		//solving using doubly ended queue(deque)
		int arr[]= {-8,2,3,-6,10};
		int k=2;
		int n=arr.length;
		Deque<Integer> dq=new ArrayDeque<Integer>();
		ArrayList<Integer>ans=new ArrayList<>();
		
		//process first window of k size
		for(int i=0; i<k; i++) {
			if(arr[i]<0) {
				dq.addLast(i);
			}
		}
		
		////store ans of first k sized window	
		if(dq.size()>0) {
			ans.add(arr[dq.peek()]);
		}
		else {
			ans.add(0);
		}
		
		//process for remaining window
		for(int i=k; i<n; i++) {
			///removal
			if(!dq.isEmpty() && i-dq.peek()>=k) {
				dq.removeFirst();
			}
			
			//addition
			if(arr[i]<0){
				dq.addLast(i);
			}
			
			//ans stroe kra lo
			if(dq.size()>0) {
				ans.add(arr[dq.peek()]);
			}
			else {
				ans.add(0);
			}
		}
		System.out.println(ans);
		
	}

}
