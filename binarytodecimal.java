package Arrays;

public class binarytodecimal {

	public static void main(String[] args) {
		int num= 1011;
        int dec_value = 0;
        int base = 1;
        while (num > 0) {
       
            int last_digit = num % 10;
            num = num / 10;
            dec_value =dec_value+ last_digit * base;
 
            base = base * 2;
        }
        System.out.println(dec_value);
		}
}
