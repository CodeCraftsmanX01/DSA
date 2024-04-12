package Arrays;
import java.util.Arrays;
public class heightChecker {

	public static void main(String[] args) {
	int	heights []= {1,2,3,4,5};
	int arr[]=new int[heights.length];
	int count=0;
	
	for(int i=0; i<heights.length; i++) {
		arr[i]=heights[i];
	}
	
	Arrays.sort(arr);
	for(int i=0; i<heights.length; i++) {
		if(heights[i]!=arr[i]) {
			count++;
		}
	}
	System.out.println(count);
	}
}
