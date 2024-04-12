package Strings;

public class PairsofStringsWithConcatenation {

	public static void main(String[] args) {
		String nums[] = {"1","1","1"}; 
		String target = "11";
		int count=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(i!=j){
					if((nums[i]+nums[j]).equals(target)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		

	}

}
