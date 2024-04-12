package recursion;

public class binarySearch {

	
	
	
	
	static boolean binary(int arr[], int s, int e, int k) {
		
		
		
		if(s>e) {
			return false;
		}
		
		int mid=(s+e)/2;
		
		
		
		
		System.out.println("value of arr mid is ="+arr[mid]);
		
		
		
		
		if(arr[mid]==k) {
			return true;
		}
		
		
		
		
		if(arr[mid]<k) {
			return binary(arr, mid+1, e, k);
		}
		else {
			return binary(arr, s, mid-1, k);
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]= {2, 4, 10, 14, 18, 20};
		int size=arr.length;
		int key=19;
		
	
		boolean ans=binary(arr, 0, arr.length, key);
		System.out.println(ans);
		
		
		
	
	}

}
