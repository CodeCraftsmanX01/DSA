package searching;

public class searchInsertposition {

	public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		int target = 5;
		int n=nums.length;
		int start=0;
		int end=n-1;
		
		int mid=start+(end-start)/2;
		
			while(start<=end) {
				if(nums[mid]==target) {
					System.out.println(mid);
					break;
				}
				else if(nums[mid]>target) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
				mid=start+(end-start)/2;	
		}
			
			System.out.println(start);
	}

}
