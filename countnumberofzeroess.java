package recursion;

public class countnumberofzeroess {

	static int countnum(int n, int count) {
	if(n==0) {
		return count;
	}
	int rem=n%10;
	if(rem==0) {
		return countnum(n/10,count+1);
	}
	else {
		return countnum(n/10,count);
	}
	
	
	}
	
	public static void main(String[] args) {
		int n=340202010;
		int count=0;
		int ans=countnum(n,count);
		System.out.println(ans);

	}

}
