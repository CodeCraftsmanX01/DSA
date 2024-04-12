package Arrays;
import java.util.Arrays;
public class countElementsWithSmallerAndGreater {

	public static void main(String[] args) {
		int nums[]= {-3,3,3,90};
		int count=0;
		int n=nums.length;
		
		
		for(int i=1; i<n-1; i++ ) {
			
			
			
			if(nums[0]<nums[i] && nums[i]<nums[n-1]) {
				count=count+1;
			}
			
			
			
			
		}
		System.out.println(count);
	}

}
