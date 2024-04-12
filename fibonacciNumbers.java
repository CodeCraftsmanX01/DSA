package recursion;

public class fibonacciNumbers {
	//fibonachi numbers are 0 1 1 2 3  5 8 13 21
	static int fibo(int n) {
		if(n<2) {
			return n;
		}

		return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		int ans=fibo(2);
		System.out.println(ans);

	}

}
