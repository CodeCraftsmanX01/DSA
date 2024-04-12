package babbar;
import java.util.Arrays;

public class rotateArray {
public static void main(String[] args) {
	int arr[]= {6, 2, 1, 22, 5, 8}
	;
	int end=arr.length;
	int k=4;
	int temp[]=new int[arr.length];
	
	for(int i=0; i<arr.length; i++) {
		temp[(i+k)%end]=arr[i];
		
	}
	arr=temp;
	System.out.println(Arrays.toString(arr));
	
}
}
