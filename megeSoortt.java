package recursion;
import java.util.Arrays;
public class megeSoortt {

	static int[] sort(int arr[]) {
		if(arr.length==1) {
			return arr;
		}
		
		int mid=arr.length/2;
		
		int []left=sort(Arrays.copyOfRange(arr,0,mid));
		int []right=sort(Arrays.copyOfRange(arr,mid,arr.length));
		
		return merge(left,right);
		}
	
	
	
	static int[] merge(int[] left, int[] right) {
		
		int i=0;
		int j=0;
		int k=0;
		
		int mix[]=new int[left.length+right.length];
		
		while(i<left.length && j<right.length) {
			
			if(left[i]<right[j]) {
				mix[k]=left[i];
				i++;
			}
			else {
				mix[k]=right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length) {
			mix[k]=left[i];
			i++;
			k++;
		}
		
		while(j<right.length) {
			mix[k]=right[j];
			j++;
			k++;
		}
		
		return mix;
	}



	public static void main(String[] args) {
		int arr[]= {7,3,42,4,2,1,100};
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
