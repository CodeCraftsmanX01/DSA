package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class sumofminiumandmaxelementofsubarrayusingqueue {
	public static void main(String[] args) {
		
		int arr[]= {2,5,-1,7,-3,-1,-2};
		int n=arr.length;
		int k=4;
		
		int ans=0;
		
		Deque<Integer> maximum=new ArrayDeque<Integer>(k);
		Deque<Integer> minimum=new ArrayDeque<Integer>(k);
		
		//adition of first k size window
		for(int i=0; i<k; i++) {
			while(!maximum.isEmpty() && arr[maximum.getLast()]<=arr[i]) {
				maximum.removeLast();
			}
			
			while(!minimum.isEmpty() && arr[minimum.getLast()]>=arr[i]) {
				minimum.removeLast();
			}
			maximum.addLast(i);
			minimum.addLast(i);
		}
		
		for(int i=k;i<n; i++) {
			
			ans=ans+(arr[maximum.peek()]+arr[minimum.peek()]);
			
			//next window me chlte h
			//removal
			while(!maximum.isEmpty() &&  i-maximum.peek()>=k) {
				maximum.removeFirst();
			}
			while(!minimum.isEmpty() &&  i-minimum.peek()>=k) {
				minimum.removeFirst();
			}
			
			//addition
			while(!maximum.isEmpty() && arr[maximum.getLast()]<=arr[i]) {
				maximum.removeLast();
			}
			
			while(!minimum.isEmpty() && arr[minimum.getLast()]>=arr[i]) {
				minimum.removeLast();
			}
			maximum.addLast(i);
			minimum.addLast(i);
		}
		
		//make sure to consider last window
		ans=ans+(arr[maximum.peek()]+arr[minimum.peek()]);
		
		System.out.println(ans);
	}
}
