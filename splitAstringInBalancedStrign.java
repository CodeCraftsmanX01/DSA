package Strings;

public class splitAstringInBalancedStrign {

	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		  int max=0;
		  int countl=0;
		  int countr=0;
		  int count=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='L')
	                countl++;
	            else {
	                countr++;
	            }
	            if(countl==countr){
	                max++;
	            }
	        }
	        System.out.println(max);
	}

}
