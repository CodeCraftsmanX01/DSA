package Arrays;
import java.util.Arrays;

public class twoOutOfThree {

	

	public static void main(String[] args) {
		int nums1[] = {3,1};
		int nums2 []= {2,3};
		int nums3[] = {1,2};
		int arr[]=new int[10];
		
		int index=0;
		for(int i=0; i<nums1.length; i++) {
			for(int j=0; j<nums2.length;j++) {
			if(nums1[i]==nums2[j]) {
				arr[index++]=nums2[j];
				}
		}
			for(int j=0; j<nums3.length;j++) {
				if(nums1[i]==nums3[j]) {
					arr[index++]=nums3[j];
					}
			}
		
		}	
			
		for(int i=0; i<nums2.length;i++) {
			for(int j=0; j<nums1.length;j++) {
				if(nums2[i]==nums1[j]) {
					arr[index++]=nums1[j];
					}
			}
				for(int j=0; j<nums3.length;j++) {
					if(nums2[i]==nums3[j]) {
						arr[index++]=nums3[j];
						}
				}
			
		}
		
		for(int i=0; i<nums3.length;i++) {
			for(int j=0; j<nums1.length;j++) {
				if(nums3[i]==nums1[j]) {
					arr[index++]=nums1[j];
					}
			}
				for(int j=0; j<nums2.length;j++) {
					if(nums3[i]==nums2[j]) {
						arr[index++]=nums2[j];
						}
				}
			
		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				arr[j]=0;
			}
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

