package Arrays;
import java.util.Arrays;
public class sortArraybyParity {

	public static void main(String[] args) {
		int nums[]= {3,1,2,4, 5, 3, 8};
		
		 int index1=0;
		    int index2=nums.length-1;
		        
		    while(index1<index2){
		        if(nums[index1]%2!=0){
		            int temp=nums[index2];
		            nums[index2]=nums[index1];
		            nums[index1]=temp;
		            
		            index2--;
		        }
		        else{
		            index1++;
		        }
		    }    
		System.out.println(Arrays.toString(nums));
	}

}
