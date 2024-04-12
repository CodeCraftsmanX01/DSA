package recursion;

public class factorial {
	
	static int factoriall(int n) {
		//base case
		if(n==0) {
			return 1;
			
		}
		int choti=factoriall(n-1);
		int badi=n*factoriall(n-1);
		
		return badi;
		
	}
	
public static void main(String []args) {
	int n=4;
	
	int ans=factoriall(n);
	System.out.println(ans);
	
}
}
