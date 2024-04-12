package Arrays;
import java.util.Arrays;
public class threeconsucutiveOdds {

	public static void main(String[] args) {
		int arr[]= {2,6,4,1,3,5};
	boolean ans=false;
		 int count=0;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i]%2!=0) {
				 count=count+1;
				 if(count==3) {
					 ans=true;
						break;
					 }
			 }
			 else {
				 count=0;
				
			 }
			 
			 
		 }
	System.out.println(ans);
	int  arr1[] = {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0};
		 Arrays.sort(arr1);
		 System.out.println(Arrays.toString(arr1));
	}
	
		
		
		/*for(var i = 0; i <= arr.length - 3; i++)
	        if(arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0)
	        {
	        	System.out.println("true");
	        }
	      
		  {
			  System.out.println("false");
		  }
	    }
	*/
}
