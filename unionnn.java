package Arrays;
import java.util.Arrays;
public class unionnn {
	
	static void intersection(int arr1[], int arr2[], int m, int n) {
		int i=0;
		int j=0;
		
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				i++;
				
			}
			else if(arr2[j]<arr1[i]) {
				j++;
			
			}
			else {
				System.out.println(arr2[j++]);
				
				i++;
			}
		}
	}
	
	
  static void union(int arr1[], int arr2[], int m, int n) {
	  
	int i=0;
	int j=0;
	
	while(i<m && j<n) {
		if(arr1[i]<arr2[j]) {
			System.out.println(arr1[i++]);
			
		}
		else if(arr2[j]<arr1[i]) {
			System.out.println(arr2[j++]);
		
		}
		else {
			System.out.println(arr2[j++]);
			
			i++;
		}
	}
	 while(i<m) {
		  System.out.println(arr1[i++]);
	  }
	  while(j<n) {
		  System.out.println(arr2[j++]);
	  }
	
		  
  }
  
  
  
	public static void main(String[] args) {
		int arr1[]= {1,2,6, 9, 5,8};
		int arr2[]= {2,4, 5};
		
		int m=arr1.length;
		int n=arr2.length;
		
		
		union(arr1, arr2, m, n);
		System.out.println();
		intersection(arr2, arr2, m, n);
		
		
	}

}
