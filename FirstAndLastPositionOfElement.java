package babbarleetcode;

public class FirstAndLastPositionOfElement {

	public static void main(String[] args) {
	int arr[]= {0,0, 1,1,2,2,2,2,2};
	int key=2;
	
System.out.println("first occurence ="+firstOcurence(arr, key));
System.out.println();
System.out.println("last occurence ="+lastOcurence(arr, key));
System.out.println();
System.out.println("total occurence of key = "+((lastOcurence(arr, key)-firstOcurence(arr, key))+1));
System.out.println();
	}
	
	
	
	
	static int firstOcurence(int arr[], int key) {
	int start=0;
	int ans=-1;
	int end=arr.length-1;
	
	int mid=(start+end)/2;
	
	
	while(start<=end) {
		if(arr[mid]==key) {
			ans=mid;
			end =mid-1;
		
			
		}
		else if(key>arr[mid]) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}
		mid=(start+end)/2;
		
	
	}
	
		return ans;
	

}
	static int lastOcurence(int arr[], int key) {
		int start=0;
		int ans=-1;
		int end=arr.length-1;
		
		int mid=(start+end)/2;
		
		
		while(start<=end) {
			if(arr[mid]==key) {
				ans=mid;
				start =mid+1;
			
				
			}
			else if(key>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			mid=(start+end)/2;
			
		
		}
		
		
		return ans;
		

	}
}
