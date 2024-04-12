package recursion;
import java.util.Arrays;

public class mergeSort {
	
	static void merge(int arr[], int s, int e) {
		int mid=(s+e)/2;
		
		int len1=mid-s+1;
		int len2=e-mid;
		
		
		int first[]=new int[len1];
		int second[]=new int[len2];
		
		
		//copy value from start index  to mid index
		//k = main array index
		int k =s;
		for(int i=0; i<len1; i++) {
			first[i]=arr[k++];
		}
		
		//copy value from mid+1 index to end index
		k=mid+1;
		for(int i=0; i<len2; i++) {
			second[i]=arr[k++];
		}
		
		
		//merge two sorted arrays
		int index1=0;
		int index2=0;
		k=s;
		
		while(index1<len1 && index2<len2) {
			if(first[index1]<second[index2]) {
				arr[k++]=first[index1++];
			}
			else {
				arr[k++]=second[index2++];
			}
			
			
			
		}
		while(index1<len1) {
			arr[k++]=first[index1++];
		}
		
		while(index2<len2) {
			arr[k++]=second[index2++];
		}
		
		
		
	}
	
	static void mergeShort(int arr[], int s, int e ) {
		//base case
		if(s>=e) {
			return;
		}
		
		
		int mid=(s+e)/2;
		//left part sort krna h
		mergeShort(arr, s, mid);
	
		
		//right part sort krna h
		mergeShort(arr, mid+1, e);
		
		
		//merge
		merge(arr, s, e);
		
	}
	
	
	
public static void main(String []args) {
	int arr[]= {10, 9, 5, 3, 46, 34, 48, 29, 31, 41, 50};
	
	int n=arr.length;
	
	mergeShort(arr, 0, n-1);

	
	System.out.println(Arrays.toString(arr));
}
}
