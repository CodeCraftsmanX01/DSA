package babbar;
import java.util.*;

public class notes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount =");
		int amount=s.nextInt();
		
		
		int a[]= {100,50, 20, 10 ,1};
		int i=0;
	
		
		switch(a[i]) {
		case 100: int ans=amount/100;
				amount = amount%100;
				System.out.println("no. of 100 rs notes ="+ans);
				System.out.println("rest amount ="+amount);
				System.out.println();
				
		case 50: ans=amount/50;
				 amount=amount%50;	
				 System.out.println("no. of 50 rs notes ="+ans);
				 System.out.println("rest amount ="+amount);
				 System.out.println();
		
		case 20: ans=amount/20;
		 		 amount=amount%20;	
		 		 System.out.println("no. of 20 rs notes ="+ans);
		 		 System.out.println("rest amount ="+amount);
		 		System.out.println();
		 		 
		case 10: ans=amount/10;
		 			 amount=amount%10;	
		 			 System.out.println("no. of 10 rs notes ="+ans);
		 			 System.out.println("rest amount ="+amount);
		 			System.out.println();
		 			 
		case 1: ans=amount/1;
		 		 amount=amount%1;	
		 		 System.out.println("no. of 1 rs notes ="+ans);
		 		 System.out.println("rest amount ="+amount); 			 
		}
		 
		

	}

}
