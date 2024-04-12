package recursion;

public class fibonaccii {

	static int fibonacci(int n) {
		//base case
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		//processing
		
		int ans=fibonacci(n-1)+fibonacci(n-2);
		
		//recursive relation
		return ans;
		
	}

	
	public static void main(String[] args) {
	
		int n=8;
	
		int ans=fibonacci(n);
		
		System.out.println(ans);
		
	}

}
