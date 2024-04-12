package babbar;

public class stringReverse {

	public static void main(String[] args) {
		String str="Anil";
		String nstr="";
		
		
		
		for (int i=0; i<str.length(); i++)
	      {
	      char  ch= str.charAt(i); 
	        nstr= ch+nstr;
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
			
			

	}
