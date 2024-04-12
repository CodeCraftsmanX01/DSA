package searching;
import java.util.*;
public class firstandlastpositionofelement {

	public static void main(String[] args) {
		int arr[]= {4,5,5,7,11,11,11,11,11,11,40,40};
		int arr1[]= {-1,-1};
		int key= 11;
		int firstoccurence=0;
		int start=0;
		int end=arr.length-1;
		
		int mid=start+(end-start)/2;
		
		//for left  most occurence
		while(start<=end) {
			if(arr[mid]==key) {
				firstoccurence=mid;
				end=mid-1;
			}
			else if(arr[mid]<key) {
				start=mid+1;
				
			}
			else if(arr[mid]>key){
				end=mid-1;
			}
			
			mid=start+(end-start)/2;
			
		}
		arr1[0]=firstoccurence;
		//for last  most occurence
		
		int start1=0;
		int end1=arr.length-1;
		int lastoccurence=0;
		int mid1=start1+(end1-start1)/2;
		
				while(start1<=end1) {
					if(arr[mid1]==key) {
						lastoccurence=mid1;
						start1=mid1+1;
					}
					else if(arr[mid1]<key) {
						start1=mid1+1;
						
					}
					else if(arr[mid1]>key){
						end1=mid1-1;
					}
					
					mid1=start1+(end1-start1)/2;
					
				}
			arr1[1]=lastoccurence;
		System.out.println("first and last occurence is:- "+Arrays.toString(arr1));
		
		int totaloccurence=(lastoccurence-firstoccurence)+1;
		System.out.println("total number of  occurence is:- "+totaloccurence);
	}

}
