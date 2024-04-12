package recursion;

public class Stairss {
	
	
	
	static int stairs(int n){
		//base case
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		
		int ans=stairs(n-1)+stairs(n-2);
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=4;
		int an=stairs(n);
		System.out.println(an);
		
	}

}
