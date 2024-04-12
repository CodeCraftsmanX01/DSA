package babbar;
import java.math.*;

public class powerrtwo {

	public static void main(String[] args) {
		int n = 16;
	
		
		for(int i=1; i<=30;i++) {
			int ans=(int) Math.pow(2, i);
			
			if(ans==n) {
				System.out.println("yes");
				break;
			}
			else {
				System.out.println("no");
				break;
			}
		}
		

	}

};
