package stackandqueue;

public class circulartour {

	public static void main(String[] args) {
		int n=4;
		int petrol[]= {6,3,7};
		int distance[]= {4,6,3};
	/*	int balPet=0;
		int start=0; 
	//sbse phle starting point dhundenge
		
		/*for(int i=0; i<petrol.length; i++) {
			if(petrol[i]-distance[i]>0) {
				start=i;
			}
		}
	int front=start; int rear=start;
	
		int front=0;
		int rear=0;
		for(int j=0; j<petrol.length; j++) {
			if((petrol[j]+balPet)-distance[j]>0) {
				balPet=(petrol[j]+balPet)-distance[j];
				rear++;
			}
			else {
				front=rear+1;
				start=front;
				rear=front;
			}
		}
		if(front==rear) {
			System.out.println(front);
		}
		else {
			System.out.println("not complete");
		}
		
		
	*/	
		int balance=0;
		int deficit=0;
		int start=0;
		for(int i=0; i<petrol.length; i++) {
			balance=balance+(petrol[i]-distance[i]);
			if(balance<0) {
				deficit=deficit+balance;
				start=i+1;
				balance=0;	
			}
		}
		if(deficit+balance>=0) {
			System.out.println(start);
		}
		else {
			System.out.println("not circular");
		}
	}

}
