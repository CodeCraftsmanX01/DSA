package sorting;
import java.util.*;
public class selectionsort {

	public static void main(String[] args) {
		int arr[]= {5,3,6,2,10,14,7,9};
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			int minIndex=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}
		}
System.out.println(Arrays.toString(arr));
	}

}
/*
-> worst and average case time complexity =O(N^2)
-> best case time complexity =O(N^2).
-> Auxiliary space = 1.
-> stable = no.
*/
