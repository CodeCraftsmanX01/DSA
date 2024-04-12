package pattern;

public class o {
public static void main(String []args) {
	int n=4;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
	}
	
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	//next pattern
	
	int count=0;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(count=count+1);
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
}
