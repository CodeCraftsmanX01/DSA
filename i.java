package pattern;

public class i {
public static void main(String []args) {
	int n=5;
	for(int i=1; i<=n; i++) {
		
		for(int j=1; j<=n-i; j++ ) {
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			System.out.print(" *");
		}
		System.out.println();
	}
	int m=5;
	for(int i=1; i<=m; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(" ");
		}
		for(int k=1; k<=m-i; k++) {
			System.out.print(" *");
		}
		
		System.out.println();
	}
}

}
