package Arrays;
import java.util.Arrays;
public class subArrays {

	public static void main(String[] args) {
		
		int arr[]= {12,17,15,13,10,11,12};
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
