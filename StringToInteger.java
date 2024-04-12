package Strings;

public class StringToInteger {

	public static void main(String[] args) {
		String s= "   -42";
		String str="";
		String nstr="";
		s=s.trim();
		if(s.length()==0) {
            System.out.println(0);
		}
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ' || (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)) {
				continue;
			}
			else {
				str=str+s.charAt(i);
			}
		}
		int i;
		i=Integer.parseInt(str); 

		if(i>2147483647)
            i=2147483647;
        if(i<-2147483648)
            i=-2147483648;
		System.out.println(i);
	}

}
