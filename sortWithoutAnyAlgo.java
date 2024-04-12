package Arrays;
import java.util.Arrays;
public class sortWithoutAnyAlgo {

	static void sort(int arr[], int n) {
		int zeroes=0;
		int ones=0;
		int twos=0;
		
		
		for(int i=0; i<n; i++) {
		if(arr[i]==0) {
			zeroes++;
		}
		else if(arr[i]==1){
			ones++;
		}
		else{
			twos++;
		}
		
		}
		
		for(int i=0; i<n;i++) {
			if(i<zeroes) {
				arr[i]=0;
			}
			else if(i<(zeroes+ones)) {
				arr[i]=1;
			}
			
			else if(i<n) {
				arr[i]=2;
			}
		}
		
		}
		
		
		
		
	
	
	
	public static void main(String[] args) {
	int arr[]= {0, 1, 2, 0, 2, 1, 0, 1};
	int n=arr.length;
	
	
	sort(arr, n);
	System.out.println(Arrays.toString(arr));
	}

}
