package linkedlist;

public class happynumber {

	public static void main(String[] args) {
		/*A happy number is a number defined by the following process:

			1.Starting with any positive integer, replace the number by the sum of the squares of its digits.
			2.Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
			3.Those numbers for which this process ends in 1 are happy.*/
		
		
		int n=19;
		while(n!=1){
			
		int ans=0;
		
		while(n!=0) {
			int digit=n%10;
			n=n/10;
			ans=ans+(digit*digit);
		}
		n=ans;
		}
		if(n==1) {
			System.out.println("true");
		}
		else {
		System.out.println("false");
		}

	}

}
