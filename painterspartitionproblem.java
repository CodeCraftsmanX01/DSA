package searching;

public class painterspartitionproblem {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int n=arr.length;
		int k=2;
		
		int ans=allocatepartition(arr, n, k);
		System.out.println(ans);
		
	}
	
	public static int allocatepartition(int arr[], int n, int k) {
		int start=0;
		int sum=0;
		int ans=-1;
		for(int i=0; i<n ; i++) {
			sum=sum+arr[i];
		}
		int end=sum;
		
		int mid=start+(end-start)/2;
		
		while(start<=end) {
			if(possible(arr, n, k,mid)){
				ans=mid;
				end=mid-1;
				}
			else {
				start=mid+1;
			}
			mid=start+(end-start)/2;
			}
		return ans;
	}
	
	public static boolean possible(int arr[], int n, int k, int mid) {
		int painter=1;
		int paintedspace=0;
		
		for(int i=0; i<n; i++) {
			if(paintedspace+arr[i]<=mid) {
				paintedspace=paintedspace+arr[i];
			}
			else {
				painter++;
				if(painter>k || arr[i]>mid) {
					return false;
				}
				paintedspace=arr[i];
			}
		}
		return true;
		
	}
}
