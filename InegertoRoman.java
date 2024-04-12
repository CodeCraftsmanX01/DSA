package Strings;

public class InegertoRoman {

	public static void main(String[] args) {
		int amount=3999;
		
		
		int s=amount/1000;
		System.out.println(s);
		amount = amount%1000;
	
		int k=amount/500;
		System.out.println(k);
		amount = amount%500;
	
		int m=amount/100;
		System.out.println(m);
		amount = amount%100;
		
		int l=amount/50;
		System.out.println(l);
		amount = amount%50;
	
		int q=amount/10;
		System.out.println(q);
		amount = amount%10;
		
		int p=amount/5;
		System.out.println(p);
		amount = amount%5;
	
		int r=amount/1;
		System.out.println(r);
		amount = amount%1;
	
		
		
		
	
	}

}
