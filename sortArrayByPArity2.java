package Arrays;
import java.util.Arrays;
public class sortArrayByPArity2 {

	public static void main(String[] args) {
		int nums[]= {4,2,5,7};
		int arr[]=new int [nums.length];
		int j=0;
		int k=1;
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]%2==0) 
			{
				arr[j]=nums[i];
				j=j+2;
			}
			
			else {
				arr[k]=nums[i];
				k=k+2;
						
			}
		}
		
		System.out.println(Arrays.toString(arr));
		

	}
	}
