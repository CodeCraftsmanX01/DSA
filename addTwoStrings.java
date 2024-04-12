package Strings;
import java.util.Arrays;
public class addTwoStrings {

	public static void main(String[] args) {
	String	num1 = "9", num2 = "99";
	int carry =0;
	int lastdig=0;
	String res="";
	int n=Math.abs(num1.length()-num2.length());
	
	
		if(num1.length()>=num2.length()) {
		int number1[]=new int[num1.length()];
		int number2[]=new int[num1.length()];
		for(int i=0; i<num1.length() ; i++) {
			number1[i]=num1.charAt(i)-48;
		}
		for(int i=0; i<num2.length() ; i++) {
			number2[n++]=num2.charAt(i)-48;
		}
		int i=number1.length-1;
		int j=number2.length-1; 
		
		while(i>=0 && j>=0  || carry!=0) {
			int sum=number1[i]+number2[j]+carry;
			lastdig=sum%10;
			res=lastdig+res;
			carry=sum/10;
			i--;
			j--;
		}
		}
	
	
			else {
				int number1[]=new int[num2.length()];
				int number2[]=new int[num2.length()];
				for(int i=0; i<num1.length() ; i++) {
					number1[n++]=num1.charAt(i)-48;
				}
				for(int i=0; i<num2.length() ; i++) {
					number2[i]=num2.charAt(i)-48;
				}
				int i=number1.length-1;
				int j=number2.length-1; 
				
				while(i>=0 && j>=0 || carry!=0) {
					int sum=number1[i]+number2[j]+carry;
					lastdig=sum%10;
					res=lastdig+res;
					carry=sum/10;
					i--;
					j--;
				}
			}
	System.out.println(res);
	
	}

}
