package Arrays;

public class smallestIndex {

	public static void main(String[] args) {
		int nums[]= {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
		int ans=0;
		for(int i=0; i<nums.length; i++) {
			if(i %10 == nums[i]) {
			ans=i;
			break;
			}
			else {
				ans=-1;
			}
		}
		System.out.println(ans);
	}

}
