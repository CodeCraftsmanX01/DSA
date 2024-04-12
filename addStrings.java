package Strings;

public class addStrings {

	public static void main(String[] args) {
		String num1 = "11", num2 = "123";
		int res=0;
		
		int i=num1.length()-1;
		int j=num2.length()-1;
		
		System.out.println(num1.charAt(i)+num2.charAt(j));
		/*while(i>=0 || j>=0) {
			res=res+(num1.charAt(i)+num2.charAt(j));
			i--;
			j--;
		}*/
		System.out.println(res);
	}

}
