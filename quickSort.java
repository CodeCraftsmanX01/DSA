package recursion;
import java.util.Arrays;

public class quickSort {
	
	
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	static int partition(int arr[], int s, int e) {
		
		int pivot=arr[s];
		int count=0;
		
		for(int i=s+1; i<=e; i++) {
			if(arr[i]<=pivot) {
				count++;
			}
			
		}
		//place pivot at right place
		int pivotIndex=s+count;
		
		//swapping pivot index element with  starting element
		swap(arr, pivotIndex, s);
		
		//left and right wala part
		
		int i=s;
		int j=e;
		while(i<pivotIndex && j>pivotIndex) {
			
			while(arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			
			//swap i++ wala element and j-- wala element
			if(i<pivotIndex && j>pivotIndex) {
				
				swap(arr, i++, j--);
				
			}
			
		}
		return pivotIndex;
		
	}
	
	
	
	static void quickShort(int arr[], int s, int e) {
		// base case
		
		if(s>e) {
			return;
		} 
		
		//partition
		int p=partition(arr, s, e);
		
		
		//left part sort kro
		quickShort(arr, s,p-1);
		
		//right wala part sort kro
		quickShort(arr, p+1, e);
		
	}
	
	
	public static void main(String[] args) {
	int arr[]= {3, 2, 4, 1, 5, 1, 7, 6, 9, 8, 10, 16, 14};
	int n=arr.length;
	
	quickShort(arr, 0, n-1);
	
	System.out.println(Arrays.toString(arr));

	}

}
