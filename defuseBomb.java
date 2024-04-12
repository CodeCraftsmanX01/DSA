package Arrays;
import java.util.Arrays;
public class defuseBomb {

	public static void main(String[] args) {
		int code[]= {5,7,1,4};
		int n=code.length;
		int sum=0;
		int k=3;
	
		int arr[]=new int[n];
		
		
		
		for(int i=0; i<n; i++) {
		
			sum=0;
			if(k>0) {
				for(int j=i+1; j<=k+i; j++) {
					if(j<n) sum += code[j];
                    else sum += code[j-n];
				}
				arr[i]=sum;
			}
			
			if(k<0) {
				for(int j=i-1; j>=k+i; j--) {
					if(j>=0) sum += code[j];
                    else sum += code[j+n];
				}
				arr[i]=sum;
	
			}
			if(k==0) {
				arr[i]=0;
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));
	}

}



