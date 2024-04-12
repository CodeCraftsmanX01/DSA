package babbar;
import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int arr[]= {6, 2, 1, 22, 5, 8};
		
		for
		(int i=1; i<=arr.length; i++) {
			//this loop is for round
			for(int j=0; j<arr.length-i; j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
