package Strings;
import java.util.Arrays;
public class StringIntoGroupsofSizek {

	public static void main(String[] args) {
		String s = "abcdefghij";
		String ns="";
		int k = 3;
		char fill = 'x';
		int plus=s.length()%k;
		System.out.println(plus);
		int cfill=0;
		int times=k-plus;
		ns=s+times(fill);
		
		System.out.println(ns);
		String str="";
		int count=0;
		int j=0;
		String result[];
		int res=s.length()%k;
		
		
		if(res==0) {
			 result=new String[s.length()/k];
		}
		else {
			result=new String[s.length()/k+1];
		}	
		
		
			for (int i = 0; i < s.length(); i++) {
	            if (count < k) {
	                str=str+s.charAt(i);
	                count++;
	            }
	            else {
	                result[j++] = str ;
	                count = 0 ;
	                str = "" ;
	                i--;
	            }
				}
			while (count++ < k) {
				str=str+ fill ;
				result[j] = str ;
			}
	        
	        System.out.println(Arrays.toString(result));
		}
			
		
		
		}


