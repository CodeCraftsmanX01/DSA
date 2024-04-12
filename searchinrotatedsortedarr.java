package searching;

public class searchinrotatedsortedarr {

	public static void main(String[] args) {
		int nums[] = {1,3};
		int target=3;

		//get pivot
		int start=0;
		int end=nums.length-1;
		int mid=start+(end-start)/2;
		
		//find pivot first
		while(start<end) {
			if(nums[mid]>=nums[end]) {
				start=mid+1;
			}
			else {
				end=mid;
			}
			mid=start+(end-start)/2;
		}
		int pivot=start;
		int ans=-1;

		//binary search lgao is condition ke liye
		if(target>=nums[pivot] && target<=nums[nums.length-1]) {
			int start1=pivot;
			int end1=nums.length-1;
			int mid1=start1+(end1-start1)/2;
			
			
		while(start1<=end1) {
			if(nums[pivot]==target) {
				ans= mid1;
			}
			if(target>nums[mid]) {
				start1=mid1+1;
			}
			else {
				end1=mid1-1;
			}
			mid1=start1+(end1-start1)/2;
		}
		}
		
		//nhi to binary search lagao is condition ke liye
		else {
			int start1=0;
			int end1=pivot-1;
			int mid1=start1+(end1-start1)/2;
			
			
		while(start1<=end1) {
			if(nums[pivot]==target) {
				ans= mid1;
			}
			if(target>nums[mid]) {
				start1=mid1+1;
			}
			else {
				end1=mid1-1;
			}
			mid1=start1+(end1-start1)/2;
		}
		}
		
		System.out.println(ans);
		
	}

}
