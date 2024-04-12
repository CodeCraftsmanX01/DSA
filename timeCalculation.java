package Arrays;
import java.util.Arrays;
public class timeCalculation {

	public static void main(String[] args) {
	int startTime[]= {1,2,3, 5, 2, 5};
	int endTime[]= {3,2,7, 9, 8, 11};
	int query=4;
	int count=0;
	int arr[]=new int[2];
	
	
for(int i=0; i<startTime.length; i++) {
		
		
		arr[0]=startTime[i];
		arr[1]=endTime[i];
		
		System.out.println(Arrays.toString(arr));
		if(query>=arr[0] && query <=arr[1]) {
			count++;
		
		}
		
		arr[0]=0;
		arr[1]=0;


	
	
	}
System.out.println(count);
	}

}
