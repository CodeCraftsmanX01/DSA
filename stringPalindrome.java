package babbar;

public class stringPalindrome {
	public static void mian(String[] args) {
String a="anil";
int i=0; 
int j=a.length()-1;

while(i<j) {
	if(a.charAt(i)!=a.charAt(j)) {
		i++;
		j--;
	}
	System.out.println("no it is not a palindrome string");
}
}
}