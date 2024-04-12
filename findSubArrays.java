package Arrays;
import java.util.Arrays;
public class findSubArrays {
	public static void main(String[] args) {
		int arr[]= {0,0,0,2,0,0};
		
		//We will use three loop to print subarrays.
		//Outer loop will be used to get start index
		//First inner loop will be used to get end index
		//Second inner loop will be used to print element from start to end index.
	
	int n=arr.length;
	
	for(int i=0; i<arr.length; i++) {
		//This loop will select start element
		for(int j=i; j<arr.length; j++) {
			//This loop will select end element
			for(int k=i; k<=j; k++) {
				
				//This loop will print element from start to end
				System.out.print( arr[k]+"");
				
				
			}
			
			System.out.println();
		}
		
	}
	
	
	
	}
}
