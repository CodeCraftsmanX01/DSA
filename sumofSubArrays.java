package stackandqueue;
import java.util.*;  

public class sumofSubArrays {

	public static void main(String[] args) {
		int []nums= {4,-2,-3,4,1};
		 long result = 0;
	        Stack<Integer> inc = new Stack<>();
	        Stack<Integer> dec = new Stack<>();
	        for(int i = 0 ; i <= nums.length ; i ++){
	            while(!inc.isEmpty() && ( i == nums.length || nums[inc.peek()] < nums[i])){
	                int currIndex = inc.pop();
	                int leftBound = inc.isEmpty() ? -1 : inc.peek(); 
	                int rightBound = i;
	                result += (currIndex - leftBound) * (rightBound - currIndex) * (long) nums[currIndex];                
	            }
	            while(!dec.isEmpty() && (i == nums.length || nums[dec.peek()] > nums[i])){
	                int currIndex = dec.pop();
	                int leftBound = dec.isEmpty()? -1 : dec.peek(); 
	                int rightBound = i;
	                result -= (currIndex - leftBound) * (rightBound - currIndex) * (long) nums[currIndex];
	            }
	            inc.push(i);
	            dec.push(i);
	        }
	        
		System.out.println(result);
	}

}
