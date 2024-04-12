package Strings;

public class longestSubstringWithoutRepeatingChars {

	public static void main(String[] args) {
		String s = "pwwkew";
	
		int length= 0;
		
		if(s.length() < 2){
            System.out.println(s.length());
        }
        
		int i=0; 
		int j=1;
		  while(j < s.length() && i < s.length()){{
				String nstr=s.substring(i, j);
				System.out.println(nstr);
				if(nstr.contains(s.charAt(j) + "")){
					i++;
	            }
				else{
				j++;
					if(j-i > length){
						length = j-i;
	                }
			}
		}
		}
		
		System.out.println(Math.max(length,0));	
	}

}
