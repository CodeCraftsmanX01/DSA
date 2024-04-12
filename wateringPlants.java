package Arrays;

public class wateringPlants {

	public static void main(String[] args) {
		int plants[]= {2,2,3,3};
		int capacity=5;
		int refill=capacity;
		int steps=0;
		int j=0;
		
		
		for(int i=0; i<plants.length; i++) {
			if(capacity>=plants[i]) {
				capacity=capacity-plants[i];
				steps=steps+1;
				
			}
			else {
				capacity=refill;
				capacity=capacity-plants[i];
				steps=((steps+i)+(i+1));
			}
		}
		System.out.println(steps);
		
	}

}
