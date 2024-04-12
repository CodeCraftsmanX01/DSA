package pattern;

public class j {
public static void main(String []args) {
int n=5; 
int s=1;
for(int i=0; i<n; i++) {
	for(int j=n-1; j>i; j--) {
		System.out.printf(" ");
	}
	for(int k=0; k<s; k++) {
		System.out.printf("*");
		s+=2;
	}
	
System.out.println();
    }
}
}
