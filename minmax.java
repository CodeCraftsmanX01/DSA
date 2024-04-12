package babbar;

public class minmax {

	public static void main(String[] args) {
		int arr[]= {12, 15, 11, 16, 10, 1, 21, 18, 6};
		int max = arr[0] ;
		int min = arr[0] ;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
			max=arr[i];	
			}		
			
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
			min=arr[i];	
			}		
			
		}
		
		System.out.println("maximum value in array is ="+" "+ max);
		System.out.println("minimum value in array is ="+" "+ min);
	}

}
