package babbarleetcode;
import java.util.Arrays;
public class duplicatezeros {
public static void main(String []args) {
	int arr[]= {1,0,2,3,0,4,5,0};
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]==0) {
			 for (int j= arr.length-1; j > i; j-- ){
			        arr[j] = arr[j-1];
			
	}
		arr[i]=0;
		i++;

}

}
	System.out.println(Arrays.toString(arr));
}
}
