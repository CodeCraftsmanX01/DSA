package recursion;

public class powerr {
	static int power(int n) {
		//base case
		if(n==0) {
			return 1;
		}
		//recursive relation
		int power=2*power(n-1);
		return power;
		
	}
	
	
	public static void main(String []args) {
		int n=6;
		
		int ans=power(n);
		System.out.println(ans);
	}
}
