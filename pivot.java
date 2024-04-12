package babbarleetcode;

public class pivot {

	public static void main(String[] args) {
	int arr[] = {6, 8, 10,17, 1, 3};
	int start=0;
	int end= arr.length-1;
	
	int mid=(start+end)/2;
	
	
	while(start<end) {
		if(arr[mid]>=arr[0]) {
			start=mid+1;
		}
		else {
			end=mid;
		}
		mid=(start+end)/2;
	}
	System.out.println("pivot is= "+start);

	}

}
