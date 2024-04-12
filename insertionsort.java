package sorting;
import java.util.*;
public class insertionsort {

	public static void main(String[] args) {
		int arr[]= {5,3,6,2,10,14,7,9};
		int n=arr.length;
		
	/*	for(int i=1; i<n; i++) {
			int temp=arr[i];
			int j=i-1;
			for(j=i-1; j>=0; j--) {
				if(arr[j]>temp) {
					//shift
					arr[j+1]=arr[j];
				}
				else {
					//ruk jao
					break;
				}
			}
			arr[j+1]=temp;
		}  */
		
		
		//OR//
		
		
		for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
  
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
		System.out.println(Arrays.toString(arr));
    }

}
/*
-> worst and average case time complexity =O(N^2).
-> Auxiliary space = O(1).
-> Sorting in place = yes.
-> stable = yes.
*/