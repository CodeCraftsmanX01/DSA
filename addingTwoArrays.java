package babbarleetcode;
import java.util.Arrays;
public class addingTwoArrays {
public static void main(String []args) {
	int nums1[]= {1,2,3,0,0,0};
	int nums2[]= {2,5,6};
	
    int a=nums1.length;
    int b=nums2.length;
    int c=a+b;
    
    int n[]=new int[c];
    
    
    for(int i=0; i<a; i++) {
    	n[i]=nums1[i];
    
    }

	
	for(int j=0; j<b; j++) {
		n[a+j]=nums2[j];
	}
	
	
	System.out.print(Arrays.toString(n));
	
	Arrays.sort(n);
	System.out.println(Arrays.toString(n));
	for(int i=0; i<n.length; i++) {
		if(n[i]==0) {
		}
	}
}


}
