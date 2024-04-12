package stackandqueue;
import java.util.*;
public class NextGreaterElementII {

	public static void main(String[] args) {
		int nums []= {1,2,3,4,3};
		int n=nums.length;
		Stack<Integer>s=new Stack<>();
		int arr[]=new int[nums.length];
		
		Arrays.fill(arr, -1);
		for(int i=2*n-1; i>=0; i--) {
		
            while(!s.isEmpty()){
                if(s.peek()>nums[i%n]){
                    arr[i%n]= s.peek();
                    break;
                }
                else{
                s.pop();
                }
            }
            s.push(nums[i%n]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
