package sorting;
import java.util.*;
public class bubbleSort {

	public static void main(String[] args) {
		int arr[]= {6,5,3,2,10};
		int n=arr.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
System.out.println(Arrays.toString(arr));
	}

}
/*
-> worst and average case time complexity =O(N^2)
-> best case time complexity =O(N).
-> Auxiliary space = O(1).
-> Sorting in place = yes.
-> stable = yes.
*/