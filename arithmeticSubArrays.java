package Arrays;
import java.util.Arrays;
public class arithmeticSubArrays {

	public static void main(String[] args) {
		 int nums[] = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
		 int l[] = {0,1,6,4,8,7};
		 int r[] = {4,4,9,7,9,10};
		 boolean ans[]=new boolean[l.length];
         
			
	
	
		
		 
		 for(int i=0; i<=l.length; i++) {
			 boolean flag=true;
			 int copy[] = new int[r[i]-l[i]+1];
			 for(int j=l[i]; j<=r[i]; j++ ) {
				
					copy[j]=nums[j];
					 }
			 Arrays.sort(copy);
			 System.out.println(Arrays.toString(copy));
			
			for(int k=0;k<copy.length; k++) {
				if((copy[k+1]-copy[k])==(copy[1]-copy[0])) {
					 
					 flag=true;
					 ans[i]=flag;
		
				}
				}
			
			
			 
			System.out.println(Arrays.toString(ans));
			
		 }
		
		System.out.println(Arrays.toString(ans));
	}

}



/*int[] temp = new int[r- l + 1];
        int idx = 0;
        for(int i=l; i<=r; i++) {
            temp[idx++] = nums[i];
        }
        Arrays.sort(temp);
        if(temp.length > 1) {
            int diff = temp[1] - temp[0];
            for(int i=2;i<temp.length;i++) {
                if(temp[i] - temp[i-1] != diff) return false;
            }
        }
        return true;
    }*/

