package Arrays;
import java.util.Arrays;
public class sum {

	public static void main(String[] args) {
		int nums[]= {3,1,-2,-5,2,-4};
		int n=nums.length;
		int arr[]=new int[n];
		int j=0;
		int k=1;
		for(int i=0; i<n; i++) {
			
				if(nums[i]>0) {
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
