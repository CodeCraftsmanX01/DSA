package recursion;

import java.util.Arrays;

public class mergesortwithoutusingnewarray {
//so here we just need to take start end and mid
	//in place
	static void mergeSortt(int arr[], int s, int e) {
		if(e-s==1) {
			return;
		}
		
		int mid=s+(e-s)/2;
		
		mergeSortt(arr,s, mid);
		mergeSortt(arr,mid, e);
		
		megrge(arr,s,mid,e);
	}
	
	
	static void megrge(int[] arr, int s, int mid, int e) {
		int []mix=new int[e-s];
		int i=s; 
		int j=mid; 
		int k=0;
		
		while(i<mid && j<e) {
			if(arr[i]<arr[j]) {
				mix[k]=arr[i];
				i++;
			}
			else {
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		//it may be possible that one of the array is not complete or not finished so all the remaining elements must be added in array
		//copy the rmaining elements
		while(i<mid) {
			mix[k]=arr[i];
			i++;
			k++;
		}
		while(j<e) {
			mix[k]=arr[j];
			j++;
			k++;
		}
		
		for(int l=0; l<mix.length; l++) {
			arr[s+l]=mix[l];
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {5,4,3,7,5,6,9};
		int s=0;
		int e=arr.length;
		mergeSortt(arr,s,e);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
