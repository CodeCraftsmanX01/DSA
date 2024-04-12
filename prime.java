package babbar;
import java.util.*;

public class prime {
public static void main(String []args) {
Scanner s=new Scanner(System.in);
System.out.println("enter your number");
int n=s.nextInt();

for(int i=2; i<n; i++) {
	if(n%i==0) {
		System.out.println("number is not a prime number");
	break;
	}
	else 
		System.out.println("number is a prime number");
	break;
}
	
}
}
