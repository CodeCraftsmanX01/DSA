package recursion;

public class sumOfElements {
		static int getSum(int arr[], int size) {
			if(size<=0) {
				return 0;
			}
			
			
			int sum=arr[size-1]+getSum(arr, size-1);

			return sum;
			
			
			
			
			
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 2, 5, 2, 3,5, 10};
		int size=arr.length;
		
		
		int ans=getSum(arr, size);
		System.out.println(ans);
	}

}
