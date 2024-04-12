package searching;

public class seilingofnumber {

	public static void main(String[] args) {
		int arr[]= {2,3,6,7,9,10,13,15};
		int target=11;
		int n=arr.length;
		int ans=0;

		int start =0;
		int end=n-1;
		
		int mid=start+(end-start)/2;
		while(start<=end) {
			if(arr[mid]>=target) {
				ans=mid;
				break;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			mid=start+(end-start)/2;
		}
		
			System.out.println(ans);
	}

}
