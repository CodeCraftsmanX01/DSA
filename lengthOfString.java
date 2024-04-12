package babbar;
import java.util.Scanner;
public class lengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name =");
		char ch[]=s.next().toCharArray();

		int count=0;
		 for(int i=0; ch[i]!='\0'; i++) {
			 count++;
		 }
		System.out.println(count);

	}

}
