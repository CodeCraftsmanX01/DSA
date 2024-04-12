package Hashmap;

import java.util.HashMap;

public class subarraywithsumequaltogivesum {

	public static void main(String[] args) {
		int arr[]= {10,15,-5,15,-10,5};
		int sum=5;
		
		int currsum=0;
		int start=0;
		int end=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			currsum=currsum+arr[i];
			
			if(currsum-sum==0) {
				start=0;
				end=i;
				break;
			}
			
			if(hm.containsKey(currsum-sum)){
				start=hm.get(currsum-sum)+1;
				end=i;
				break;
			}
			hm.put(currsum,i);
					
		}

		if(end==0) {
			System.out.println("not fund any subarray swhos sum is equal to given sum");
		}
		else {
			System.out.println("["+start+", "+end+"]");
		}
	}

}
