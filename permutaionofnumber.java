package stackandqueue;
import java.util.*;
public class permutaionofnumber {

	public static void main(String[] args) {
		int totalobjects;
		int selectedobject;
		int permutation;
  
		Scanner sc = new Scanner(System.in);    
		System.out.println("Enter the Value of n and r: ");      
		totalobjects = sc.nextInt();     
		selectedobject = sc.nextInt();    
		int f1 = 1;    
		for (int i = totalobjects; i >0; i--)    
		{    
		f1 = f1 * i;    
		} 
		
		int f2 = 1;
		int below=totalobjects - selectedobject;    
		for (int i = below ; i >0; i--)    
		{    
		f2 = f2 * i;    
		}    
		
		permutation = f1 / f2;     
		System.out.println("The permutation of P(n, r) = "+permutation);    
		}    

}
