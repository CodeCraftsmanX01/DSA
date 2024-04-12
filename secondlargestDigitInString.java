package Strings;
import java.util.Arrays;
public class secondlargestDigitInString {

	public static void main(String[] args) {
		String s ="dfa12321afd";
		int largest=-1;;
		int secLargest=-1;
		int n=s.length();
	
		for(int i=0; i<n; i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                if(s.charAt(i) - 48 > largest){
                    largest =s.charAt(i) - 48;
                }
            }
        }
		for(int i=0; i<n; i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57 && s.charAt(i)-48<largest && s.charAt(i)-48>secLargest){
                secLargest = s.charAt(i)-48;
                    
            }
        }
		 System.out.println(secLargest);
	}

}
