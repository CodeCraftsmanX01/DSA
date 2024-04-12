package recursion;

public class reachHomee {
	
	static int home(int src, int dest) {
		
		System.out.println(src+" "+dest);
		
		//base case
		if(src==dest) {
			System.out.println("pahuch gya");
			return 0;
		}
		src=src+1;
		return home(src, dest);
	}
	
public static void main(String[] args) {
	
	int src=1;
	int dest=10;
	
	
	int ans=home(src, dest);
	System.out.println(ans);
}
}
