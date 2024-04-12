package pattern;

public class e {
public static void main(String []args) {
	int n=7;
	int k=0;
	for(int i=n-1; i>=0; i--) {
		for(int j=n-1; j>k; j--) {
			System.out.print(" ");
		}
		System.out.print("*");
		for (int j = 1; j < (k * 2); j++) 
            System.out.print(" ");
		if (i < n - 1)
            System.out.print("*");
		
		
		System.out.println(" ");
		k++;
	}
}
}
