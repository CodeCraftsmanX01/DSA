package babbarleetcode;

public class peakIndexInMountainArray {
public static void main(String[]args) {
	int arr[]= {1, 2, 5, 7, 8, 4, 3, 2};
	
	int start=0;
	int end=arr.length-1;
	int mid=(start+end)/2;
	
	
	while(start<end) {
		if(arr[mid]<arr[mid+1]) {
			start=mid+1;
			
		}
		else {
			end=mid;
		}
		mid=(start+end)/2;
	}
	System.out.println(start);
}
}
