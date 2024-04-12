package Strings;
import java.util.Arrays;
public class complexNumberultiplication {

	public static void main(String[] args) {
		String num1 = "1+-1i", num2 ="1+-1i";
			
		String x[] = num1.split("\\+|i");
	        String y[] = num2.split("\\+|i");
	        System.out.println(x[0]);
	        System.out.println(y[1]);
	        
	        //to slove imaginary multiplication
	        //(1+1i)(1+1i)=(1*1)+(1*1i)+(1i*1)+(1i*1i)
	        //now i sqr=-1
	        //(1+1i)(1+1i)=(1*1)+(1*1i)+(1i*1)+(1i*1i)
	        // (1*1)-(1*1) real part ("+") (1*1)+(1*1) imaginary part ("i")
	        int a_real=Integer.parseInt(x[0]);
            int b_real=Integer.parseInt(y[0]);
            int a_imag=Integer.parseInt(x[1]);
            int b_imag=Integer.parseInt(y[1]);
	        
        int real=(a_real*b_real)-(a_imag*b_imag);
	    int imag=(a_real*b_imag)+(a_imag*b_real);
	
	
	System.out.println(real+"+"+imag+"i");
	}

}
