package recursion;

public class linearSearch {
	
	static boolean search(int arr[], int size, int k) {
		
		if(size==0) {
			return false;
		}
		
		if(arr[0]==k) {
			return true;
		}
		else {
			return search(arr, size-1, k);
			
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]= {3, 4,5, 10, 12,11};
		int size=arr.length;
		int key=12;
		
		boolean ans=search(arr, size, key);
		System.out.println(ans);
		
	}

}
