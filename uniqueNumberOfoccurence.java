package Arrays;
import java.util.Arrays;
public class uniqueNumberOfoccurence {

	public static void main(String[] args) {
		int arr[]= {1,2,2,1,1,3};
	
		int arr1[]=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			
			for(int j=0; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					
					
				}
				arr1[i]=count;
				
				
			}
			
			
		}
		
System.out.println(Arrays.toString(arr1));
	}

}
