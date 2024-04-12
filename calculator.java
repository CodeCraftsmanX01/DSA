package babbar;
import java.util.*;

public class calculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of =");
		int a=s.nextInt();
		System.out.println();
		System.out.println("enter second value =");
		int b=s.nextInt();
		System.out.println();
		System.out.println("enter the operation you want to print =");
		char op=s.next().charAt(0);
		
		switch(op) {
		case '+':System.out.println(a+b);
					break;
					
		case '-':System.out.println(a-b);			
					break;
					
		case '*':System.out.println(a*b);	
					break;
					
		case '/':System.out.println(a/b);			
					break;
		}
		
		
		
		
	}

}
