package recursion;

public class palindromeee {
	
	
	static int pali(int n, int temp) {
	if(n==0) {
		return temp;
	}
	
	int rem=n%10;
	temp=(temp*10)+rem;
	return pali(n/10,temp);
	}
	
	
	public static void main(String[] args) {
	 int n=123432;
	 int temp=pali(n,0);
	 
	 if(n==temp) {
		 System.out.println("true");
	 }
	 else {
		 System.out.println("false");
	 }
	 
	}

}
