package Strings;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12343;
		int res=0;
		 while (x != 0) {
		int lastdigit=x%10;
		res=res*10+lastdigit;
		 x = x / 10;
		 }
		 if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
	            System.out.println(0);
	        } else {
	            System.out.println(res);
	        }
	}

}
