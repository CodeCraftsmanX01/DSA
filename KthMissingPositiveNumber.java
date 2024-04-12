package searching;
import java.util.*;
public class KthMissingPositiveNumber {

	public static void main(String[] args) {
		int arr[] = {2,3,4,7,11};
		int k=5;
		
		int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] - mid - 1 < k){
                start = mid + 1;
            	}
            else{
                end = mid;
            }
        }
        
      System.out.println(start+k);
    }
}
