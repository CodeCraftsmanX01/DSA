package babbarleetcode;
import java.util.Arrays;
public class addingTwoArrays2 {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 0, 0, 0};
		int b[]= {2,5,6};
	
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				for(int j=0; j<b.length; j++) {
					a[i]=b[j];
					i++;
				}
				
			}
			
			
		}
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
