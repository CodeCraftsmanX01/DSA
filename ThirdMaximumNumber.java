package sorting;
import java.util.*;
public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int nums[]= {1,1,2};
		
		Arrays.sort(nums);
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        ArrayList<Integer> arr=new ArrayList(set);
        if(arr.size()<3) {
        	System.out.println(arr.get(arr.size()-1));
        }
        System.out.println(arr.get(2));
	}

}
