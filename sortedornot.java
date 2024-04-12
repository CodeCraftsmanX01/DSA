package recursion;

public class sortedornot {
	
	static boolean sorted(int arr[], int size) {
		//base case
		if(size==0 || size==1) {
			return true;
		}
		
		//processing
		
		if(arr[size-1]<arr[size-2]) {
			return false;
		}
		else {
		
		boolean ans=sorted(arr , size-1);
		return ans;
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20, 23, 23, 95, 78, 88};
		int size=arr.length;
 
		boolean ans=sorted(arr, size);
	
		
		if(ans) {
			System.out.println("array is sorted");
		}
		else {
			System.out.println("array is not sorted");
		}
	}

}
