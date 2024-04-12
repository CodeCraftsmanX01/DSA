package babbarleetcode;

public class searchInaRotaedSortedArray {

static int search(int arr[], int start, int end, int key) {
	int mid=(start+end)/2;
	if(start>end) {
		return -1;
	}
	if(arr[mid]==key) {
		return mid;
	}
	
	
	if(arr[start]<=arr[mid]) {
		if(key>=arr[start] && key<=arr[mid]) {
			return search(arr, start, mid-1, key);
			
		}
		return search(arr, mid+1, end, key);
	}
	if(key>=arr[mid] && key<=arr[end]) {
			return search(arr, mid+1,end, key);
	}	
		return search(arr, start, mid-1, key);
}

public static void main(String[] args) {
	int arr[]= {4, 5, 6,7 , 8, 9, 1, 2,3 };
	int key=5;
	int start=0; 
	int end=arr.length-1;
	
	
	int i=search(arr, 0, end,key );
	if(i!=-1) {
		System.out.println("element found at index = "+i);
	}
	else {
		System.out.println("element not  found");
	}
	
	
	
}
}
