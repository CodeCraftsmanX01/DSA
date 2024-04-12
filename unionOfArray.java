package Arrays;
import java.util.Arrays;
public class unionOfArray {

	
	
	static void union(int arr1[],int arr2[], int arr3[],int arr4[], int n, int m, int q) {
	 for(int i=0; i<n; i++) {
		 arr3[i]=arr1[i];
	 }
	 for(int i=0; i<m; i++) {
		 arr3[n+i]=arr2[i];
	 }
	 System.out.println(Arrays.toString(arr3));
	 

	 
	 
	 for(int i=0; i<q; i++) {
		 for(int j=1; j<q; j++) {
			 if(arr3[i]!=arr3[j]) {
				arr4[i]=arr3[i];
			 }
			 
			 
		 }
		
	 }
	 System.out.println(Arrays.toString(arr4));
		
	 
	 
	}
	
	


	
	
	
	public static void main(String[] args) {
		int arr1[]= {1,2, 3, 5, 6, 8};
		int arr2[]= {2,4, 5};
		
		int n=arr1.length;
		int m=arr2.length;
		int q=arr1.length+arr2.length;
		
		int arr3[]=new int[q];
		 int arr4[]=new int[10];
		
		union(arr1, arr2, arr3,arr4, n, m,q);
	
	}

}
