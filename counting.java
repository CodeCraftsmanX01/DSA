package recursion;

public class counting {
	
	static int count(int n) {
		//base case
		if(n==0) {
			return 0;
		}
		
		int count=count(n-1);
		
		
		System.out.println(n);
		return count; 
		
	}
	public static void main(String []args) {
		int n=10;
		
		int ans=count(n);
		System.out.println(ans);
		
	}
}
