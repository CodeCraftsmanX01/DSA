package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallestelement {

	public static int kthsmallest(int arr[],int l, int r, int k) {
		//step 1
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0; i<k; i++) {
			pq.add(arr[i]);
		}
		System.out.println(pq);
		//step2
		for(int i=k; i<=r; i++) {
			if(pq.peek()>arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		System.out.println(pq);
		//step 3
		return pq.peek();
	}
	
	public static void main(String[] args) {
		int arr[]= {7,10,4,3,20,15};
		int k=3;
		//we need to print k th smallest element.
		//o/p must be 7 as 3rd smallest is 7.
		int ans=kthsmallest(arr,0, arr.length-1, k);
		System.out.println(ans);

	}

}
