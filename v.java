package pattern;

public class v {

	public static void main(String[] args) {
		int n=5;
		int alphabet=65;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)(alphabet)+" ");
			}
			
			alphabet++;
			
			
			System.out.println();
		}


	}

}
