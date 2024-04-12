package Strings;
import java.util.Arrays;
public class EqualNumberofOccurrences {

	public static void main(String[] args) {
		String s="aaabb";
		char []ch=s.toCharArray();
		int c[]=new int[ch.length];
		boolean ans=true;
		
		for(int i=0; i<ch.length; i++) {
			int count=0;
			for(int j=0;j<ch.length; j++ ) {
				if(ch[i]==ch[j]) {
					count=count+1;
					c[i]=count;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		for(int i=0; i<c.length; i++) {
			int first=c[0];
			if (c[i] != first) {
                ans=false;
                break;
			}
		}
System.out.println(ans);
	}

}
