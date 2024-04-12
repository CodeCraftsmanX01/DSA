package Arrays;
import java.util.Arrays;
public class unionn {
	
	
	static void union(int arr1[], int arr2[],int arr[], int n, int m) {
		int i,c, j, k;
		
		for(i=0; i<n; i++) {
			arr[i]=arr1[i];
		}
		
		j=i;
		for(i=0; i<m; i++) {
			c=0;
			for(k=0; k<j-1;k++) {
				if(arr2[i]==arr[k]) 
					c++;
							
			}
			if(c==0) 
				arr[j++]=arr2[i];
			

			
		}
		
		
	}

	public static void main(String[] args) {
		int arr1[]= {1,2, 3, 5, 6, 8};
		int arr2[]= {2,4, 5};
		
		int n=arr1.length;
		int m=arr2.length;
		int arr[]=new int[n+m];
		
	
		union(arr1, arr2, arr, m, m);
		System.out.println(Arrays.toString(arr));
		}

}
