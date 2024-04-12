package searching;

public class bookallocationproblem {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		int m=5;
		
		int ans=allocatebooks(arr, n, m);
		System.out.println(ans);
		
	}
	
	public static int allocatebooks(int arr[], int n, int m) {
		int ans=-1;
		int start=0;
		int sum=0;
		
		for(int i=0; i<n; i++) {
			sum=sum+arr[i];
		}
		int end=sum;
		int mid=start+(end-start)/2;
		
		while(start<=end) {
			if(isPossible(arr,n,m,mid)){
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
	
	public static boolean isPossible(int arr[],int n, int m, int mid) {
		int studentcount=1;
		int pagessum=0;
		for(int i=0; i<n;i++) {
			if(pagessum+arr[i]<=mid) {
				pagessum=pagessum+arr[i];
			}
			else {
				studentcount++;
				if(studentcount>m || arr[i]>mid) {
					return false;
				}
				pagessum=arr[i];
			}
		}
		return true;
	}

}
