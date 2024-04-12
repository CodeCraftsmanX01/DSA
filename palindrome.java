package recursion;

public class palindrome extends reverseanumber {

	static int rev(int n, int temp) {
		
		if (n == 0) {
	        return temp;
		}
		int rem=(n%10);
		temp = (temp * 10) + rem;
	    return rev(n / 10, temp);
	}
	
	public static void main(String[] args) {
		int n=1234321;
		int temp = rev(n, 0);
		if(n==temp) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
