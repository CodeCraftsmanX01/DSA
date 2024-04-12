package recursion;
import java.util.Arrays;
public class bubblesort {

	static void sort(int arr[], int i, int j) {
		if(i==0) {
			return;
		}
		
		if(i>j) {
			if(arr[j]>arr[j+1]) {
				//swap
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			sort(arr,i,j+1);
		}
		else {
			sort(arr,i-1, 0);
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]= {6,4,3,9,0,8,10};
		sort(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));

	}

}
