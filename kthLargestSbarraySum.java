package heaps;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

import Arrays.ArrayList;

public class kthLargestSbarraySum {

	public static int largestsum(int Arr[],int N,int K) {
		 ArrayList<Integer>ans=new ArrayList<Integer>();

			for(int i=0; i<N; i++) {
				int sum=0;
				for(int j=i; j<N; j++) {
					sum=sum+Arr[j];
					ans.add(sum);
				}
				
			}
			Collections.sort(ans); 
			Collections.reverse(ans);
			return ans.get(K-1);
	}
	
	public static void main(String[] args) {
		int arr[]= {2,6,4,1};
		int n=4;
		int k=3;
		
		int ans=largestsum(arr,4,3);
		System.out.println(ans);
	}

}
