package babbar;

public class reverseAString {
public static void mian(String[] args) {
	String a="anil";
	char[] ch=a.toCharArray();
	int end=ch.length-1;
	
	for(int i=0; i<end; i++) {
		char temp=ch[0];
		ch[0]=ch[end];
		ch[end]=temp;
				
	}
	System.out.println(ch);
		
}
}
