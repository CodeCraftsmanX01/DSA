package pattern;

public class s {
public static void main(String []args) {
	int n=4;
	int alphabet=65;
	for(int i=1; i<=n; i++) {
		
		for(int j=0; j<n; j++) {
			System.out.print((char)(alphabet+j)+" ");
		}
		
		
		System.out.println();
	}
}
}
