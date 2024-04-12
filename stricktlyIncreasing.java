package Arrays;
import java.util.Arrays;
public class stricktlyIncreasing {

	public static void main(String[] args) {
		boolean ans=false;
		int nums[]= {1,2,10,5,7};
		int arr[]=new int[nums.length];
		int count=0;
		for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                ans=true;
            }
            
            	
            	for(int j=nums[i-1]; j<nums.length; j++) {
            		if(nums[j-1]<nums[j]){
                        ans=true;
                    }
            	}
            	
            
            
            		ans=false;
            	
      
	}
		
		
		System.out.println(ans);

}
}


/*[1,2,10,5,7]
[2,3,1,2]
[1,1,1]
*/