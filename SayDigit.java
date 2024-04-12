package recursion;
import java.util.Scanner;
public class SayDigit {
	static void say(String[] arr, int n) {
		//base case
		if(n==0) {
			return;
		}
		
		//processing
		int digit=n%10;
		n=n/10;
		
		
		
		
		//recursive call
		say(arr, n);
		System.out.print(arr[digit]+"  ");
	}
	
	
	
	
	public static void main(String[] args) {
	String arr[]= {"zero", "one", "two","three", "four",
				"five", "six", "seven", "eight", "nine"}; 
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter your digit =");
	int n=s.nextInt();
	
		
		say(arr, n);
		
	
		// TODO Auto-generated method stub
	}
}
