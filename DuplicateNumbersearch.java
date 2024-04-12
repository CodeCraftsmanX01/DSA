package searching;
import java.util.Arrays;

public class DuplicateNumbersearch {

	public static void main(String[] args) {
		int nums[] = {1,3,4,4,2};
		int n=nums.length;
		
		Arrays.sort(nums);
		
		int start=0;
		int end=n-1;
		int ans=-1;
		int mid = start + (end - start)/2;
		
	    while(start<end){
			//in this condition we have to check if consecutive element of the
	        //mid are equal then return mid as a duplicate element.
	        if((mid>0 && nums[mid] == nums[mid-1] )|| (mid < nums.length && nums[mid] == nums[mid+1])){
	            ans= nums[mid];
	            break;
	        }
			//duplicate element lies in the right side of the array.
			else if(nums[mid] >= mid + 1){
	            start = mid + 1;
	        }
			//duplicate element lies in the left side of the array.
			else{
	            end = mid - 1;
	        }
	        mid = start + (end - start)/2;
	    }
	   System.out.println(ans);
		
	}

}
