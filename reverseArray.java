package babbar;
import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
int arr[]={6, 2, 1, 22, 5, 8, 9};
int end=arr.length-1;
int index=2;

for(int i=index+1; i<end; i++) {
	int temp=arr[i];
	arr[i]=arr[end];
	arr[end]=temp;
	
	
	end--;
	
}

System.out.println(Arrays.toString(arr));
}
}
