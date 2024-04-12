package babbar;

public class reverse {
public static void main(String[] args) {
	int n=123;
	int ans=0;
	int INT_MAX=2147483647;
	int INT_MIN=-2147483648;
	while(n!=0) {
		int digit=n%10;
		
		
		ans=(ans*10)+digit;
		n=n/10;
		
		if(ans>INT_MAX/10||ans<INT_MIN/10) {
			System.out.println("0");
		}
	}
	System.out.print(ans);
}
}
