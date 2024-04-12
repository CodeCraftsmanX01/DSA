package recursion;

public class findarrayissortedornot {

	static boolean sorted(int arr[],int index) {
	if(index==arr.length-1) {
		return true;
	}

		 return arr[index]<arr[index+1] && sorted(arr, index+1);
	 
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,1,4,5,6,7};
		int index=0;
		System.out.println(sorted(arr,index));
	}

}
