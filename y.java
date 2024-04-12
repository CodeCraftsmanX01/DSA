package pattern;

public class y {

	public static void main(String[] args) {
		int n=5;
		int alphabet=65;
		int k;
		
		for(int i=1; i<=n; i++) {
			k=i;
			
			for(int j=1; j<=i; j++, k++) {
				System.out.print((char)alphabet++);
			}
			
			
			System.out.println();
		}

	}

}
