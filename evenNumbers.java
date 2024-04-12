package Arrays;

public class evenNumbers {

	public static void main(String[] args) {
		int []nums = {12,345,2,6,7896};
		 int count=0;
	        String str1="";
	        for(int i=0;i<nums.length; i++){
	        str1 =Integer.toString(nums[i]);
	            if(str1.length()%2==0){
	                count++;
	            }
	            else{
	                str1="";
	            }
	        }
	        System.out.println(count);
	}

}
