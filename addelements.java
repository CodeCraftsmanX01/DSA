package Arrays;
import java.util.Arrays;
public class addelements {

	public static void main(String[] args) {
		int gain[]= {-4,-3,9,-1,4,3,2};
		int n=gain.length;
        int arr[]=new int[n+1];
        int altitude=0;
        int sum=0;
     
        for(int i=0; i<n; i++){
        	if(arr[i]<sum) {
        		altitude=sum;
        	}
            sum=sum+gain[i];
            arr[i]=sum;
				
		}
        System.out.println(altitude);
       
	}

}

