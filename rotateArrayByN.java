package Arrays;
import java.util.Arrays;
public class rotateArrayByN {
	
	public static void main(String[] args) {
		int arr[]= {4, 5, 2, 3, 0, 1};
		
		int n=arr.length;
		
	
		
		
		int last = arr[n-1];
		
		
	    for (int i=n-1; i>0; i--) {
	    arr[i]= arr[i-1];
	    }
	    
	    
	    arr[0]= last; 
	    
	    
	    
		System.out.println(Arrays.toString(arr));
	}

}
