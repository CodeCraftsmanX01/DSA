package babbar;
import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		int arr[]= {6, 2, 1, 22, 5, 8};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
