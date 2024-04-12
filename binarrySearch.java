package searching;
import java.util.*;
public class binarrySearch {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,11,20,34,40};
		int key= 40;
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		
		while(start<=end) {
			//if key is equal to arr[mid]
			if(arr[mid]==key) {
				System.out.println("elemet fround at index:- "+mid);
				break;
				}
			
			//if key is badi than arr[mid] to right wale part me jao
			else if(key>arr[mid]){
				start=mid+1;
				}
			
			//if key is less than arr[mid] to left wale part me jao
			else {
				end=mid-1;
			}
			mid=start+(end-start)/2;	
		}
		
		if ( start>end ){  
		      System.out.println("Element is not found!");  
		   }   
		
		 
	}
}
