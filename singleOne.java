package Arrays;
import java.util.Arrays;

public class singleOne {

	public static void main(String[] args) {
		int nums[]= {4,1,1,9,2,2,4};
		int count=0;
		int res=0;
		boolean ans=false;
		int arr[]=new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;	
				}
			}
			arr[i]=count;
			count=0;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				ans=true;
			}
			
		}
		
		for(int i=0;i<nums.length;i++){
			res=res^nums[i];
			System.out.println(res);
		}
		System.out.println(ans);
		
	}

}
