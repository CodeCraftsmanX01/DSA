package sorting;

import java.util.Arrays;

public class mergeSort {
	public static void rotate(int arr[],int from ,int to) {
		int temp=arr[to];
		for(int i=to; i>from; i--) {
			arr[i]=arr[i-1];
		}
		arr[from]=temp;
	}
	
	public static void rearrange(int arr[],int n) {
		int wrongindex=-1;
		
		for(int i=0; i<n; i++) {
			if(wrongindex!=-1) {
				
					if((arr[wrongindex]>=0 && arr[i]<0) || (arr[wrongindex]<0 && arr[i]>=0)) {
						rotate(arr,wrongindex,i);
						
						if(i-wrongindex>=2) {
							wrongindex=wrongindex+2;
						}
						else {
							wrongindex=-1;
						}
					}
			}
			
			else {
					if((arr[i]<0 && i%2==1) || (arr[i]>=0 && i%2==0)) {
						wrongindex=i;
					}
				
			}
		}
	}
	
	public static void printArray(int arr[], int n){
		for (int i = 0; i < n; i++)
			   System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		 int arr[] ={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
	     int n=arr.length;
	     
	     mergeSort.rearrange(arr,n);
	     mergeSort.printArray(arr,n);
	     
	}
}

//{-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}