package babbar;

public class integer {
public static void main(String []args) {
	int n=234;
	int pro=1;
	int sum=0;
	
	
	while(n!=0) {
		int digit=n%10;
		pro=pro*digit;
		System.out.println(digit);
		sum=sum+digit;
		
		n=n/10;
		
		
	
	}
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.print(pro-sum);
	
	
	
}
}
