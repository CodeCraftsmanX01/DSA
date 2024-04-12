package babbar;

import arrays.a;

public class swapalternate {
public static void main(String[] args) {
	int arr[]= {10, 12, 14, 15, 12, 16, 20, 22};

	
	for(int i=0; i<arr.length-1; i+=2) {
		
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		
		
	}
	for(int i=0; i<arr.length; i++) {
		
		System.out.print(arr[i]+" ");
	}
}
}
