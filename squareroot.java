package searching;

public class squareroot {

	public static void main(String[] args) {
		int x=8;
		
		int start=0;
		int end=x;
		int ans=-1;
		int mid=start+(end-start)/2;
		
		while(start<=end) {
			if((mid*mid)==x) {
				ans=mid;
			}
			if((mid*mid)<x) {
				ans=mid;
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			mid=start+(end-start)/2;
		}
		
		System.out.println(ans);
	}

}
