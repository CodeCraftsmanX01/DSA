package babbar;

public class decimaltobinary {

	public static void main(String[] args) {
		int n=10;
		
		while(n!=0) {
			int rem=n/2;
			rem=rem/2;
			
			System.out.println(rem);
		}
	}

}
