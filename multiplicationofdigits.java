package recursion;

public class multiplicationofdigits {
	static int multi(int n) {
		if(n%10==n) {
			return n;
		}
		return (n%10)*multi(n/10);
	}
	
	public static void main(String[] args) {
		int ans=multi(1342);
		System.out.println(ans);

	}

}
