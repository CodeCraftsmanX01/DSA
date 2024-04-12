package heaps;

import java.util.PriorityQueue;

public class minimumCostOfRopes {
//first take two elements every time
//then sum them and ans store in that array replacing by those two elements 	
//do this till array length is greater than 1
//ans add all the sum answers we got before
//we will use minimum heap
	
	public static long minimumcost(long arr[],int n) {
		//create a min heap
		PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
		long cost=0;
		
		while(pq.size()>1) {
			long first=pq.poll();
            long second=pq.poll();
            long sum=first+second;
            cost=cost+sum;
            pq.add(sum);
		}
		return cost;
	}

	public static void main(String[] args) {
	long arr[]= {4,3,2,6};
	int n=arr.length;
	
	long ans=minimumcost(arr,n);
	System.out.println(ans);

	}

}
