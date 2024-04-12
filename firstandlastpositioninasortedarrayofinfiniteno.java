package searching;
import java.util.*;
public class firstandlastpositioninasortedarrayofinfiniteno {
//take parts of length chunk bcz we does not know length of arr
	public static void main(String[] args) {
		int nums[]= {1,3,4,5,7,7,7,7,7,10,14,15,20,25,23};
		int target=7;
		
		//for first occurence
		int start=0;
        int end=1;
        while(target>end) {
        	int temp=end+1;
        	end=end+(end-start+1)*2;
        	start=temp;
        }
        int[]arr={-1,-1};
        int firstoccurence=-1;
        int mid=start+(end-start)/2;
        
        while(start<=end){
            if(nums[mid]==target){
                firstoccurence=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        arr[0]=firstoccurence;
        
        
        //for last occurence
        int start1=0;
        int end1=1;
        while(target>end1) {
        	int temp1=end1+1;
        	end1=end1+(end1-start1+1)*2;
        	start1=temp1;
        }
        
        int lastocurrence=-1;
        int mid1=start1+(end1-start1)/2;
        
        while(start1<=end1){
            if(nums[mid1]==target){
                lastocurrence=mid1;
                start1=mid1+1;
            }
            else if(nums[mid1]<target){
                start1=mid1+1;
            }
            else{
                end1=mid1-1;
            }
          mid1=start1+(end1-start1)/2;  
        }
        arr[1]=lastocurrence;
       
        System.out.println(Arrays.toString(arr));

	}

}
