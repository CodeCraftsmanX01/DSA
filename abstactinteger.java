package babbar;

public class abstactinteger {

	public static void main(String[] args) {
		int n=1234;
		
		while(n!=0) {
			int digit=n%10;
			n=n/10;
			if(digit==2) 
				break;
			
			
			System.out.println(digit);
		}
		
	}

}
