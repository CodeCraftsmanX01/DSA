package heaps;
import java.util.Arrays;
public class mergekArrays {

	public static void main(String[] args) {
		int arr[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		//Output: -12 -13 -5 -7 -3 -6 11 6 5
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0 && i!=j) {
				
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
					j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
