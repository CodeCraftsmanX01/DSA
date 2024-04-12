package Arrays;
import java.util.Arrays;
public class ballstoEachBox {

	public static void main(String[] args) {
		String boxes="110";
		int n=boxes.length();
		int str[]=new int[n];
		
		for(int i=0;i<n; i++) {
			int stepSum=0;
		for(int j=0; j<n; j++) {
			if(boxes.charAt(j)=='1') {
				int num=(j-i);
					if (num < 0) {
					   num=num*(-1);
						}
				stepSum=stepSum+num;	
			}
			
			str[i]=stepSum;
		}
		
		}
		
		System.out.println(Arrays.toString(str));	
		
	}

}
