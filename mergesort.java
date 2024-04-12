package recursion;
import java.util.*;
public class mergesort {

	static int[] mergeSortt(int arr[]) {
		if(arr.length==1) {
			return arr;
		}
		
		int mid=arr.length/2;
		
		int [] left=mergeSortt(Arrays.copyOfRange(arr,0, mid));
		int [] right=mergeSortt(Arrays.copyOfRange(arr,mid, arr.length));
		
		return megrge(left, right);
	}
	
	
	static int[] megrge(int[] left, int[] right) {
		int []mix=new int[left.length+right.length];
		int i=0; 
		int j=0; 
		int k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				mix[k]=left[i];
				i++;
			}
			else {
				mix[k]=right[j];
				j++;
			}
			k++;
		}
		//it may be possible that one of the array is not complete or not finished so all the remaining elements must be added in array
		//copy the rmaining elements
		while(i<left.length) {
			mix[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			mix[k]=right[j];
			j++;
			k++;
		}
		
		return mix;
	}


	public static void main(String[] args) {
		int arr[]= {5,4,3,7,5,6,9};
		arr=mergeSortt(arr);
		System.out.println(Arrays.toString(arr));
		//here we can see taht original array is not modified it only create objects for every function in mergeSortt method
	}

}
