package Arrays;
import java.util.Arrays;
public class differenceOfTwoArrays {
	public static void main(String[] args) {
		int nums1[]= {1,2,3};
		int nums2[]= {2,4,6};
		int k=0;
		
		int ans0[]=new int[nums1.length];
		int ans1[]=new int[nums2.length];
		
		//nums1 check
		for(int i=0; i<nums1.length; i++) {
			for(int j=0; j<nums2.length; j++) {
				if(nums1[i]==nums2[j]) {
					ans0[i]=0;
					break;
				}
				else {
					ans0[i]=nums1[i];
				}
			}
			
		}
		
	        
			
			
			
		//nums2 check
		for(int i=0; i<nums2.length; i++) {
			for(int j=0; j<nums1.length; j++) {
				if(nums2[i]==nums1[j]) {
					ans1[i]=0;
					break;
				}
				else {
					ans1[i]=nums2[i];
			
					
				}
			}
			
		}
		
		System.out.println(Arrays.toString(ans0));
		System.out.println(Arrays.toString(ans1));
		
		
	}
}
