package pattern;

public class h {
public static void main(String []args) {
	int n=5;
	int m=5;
	for(int i=1; i<=n;i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1; i<=m; i++) {
		for(int j=1; j<=m-i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
