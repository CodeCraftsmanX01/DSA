package stackandqueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class nextgreaterelement {

	public static void main(String[] args) {
		int nums1[]= {2,4};
		int nums2[]= {1,2,3,4};
		
		int [] ans = new int[nums1.length];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
		
        for(int i = nums2.length-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]) st.pop();
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],st.peek());
            	}
            st.push(nums2[i]);
        }
    
        for(int i =0 ; i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
       
System.out.println(Arrays.toString(ans));

	}

}