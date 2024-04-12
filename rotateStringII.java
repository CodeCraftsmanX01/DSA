package Strings;
import java.util.Arrays;
public class rotateStringII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="clrwmpkwru";
		String goal="wmpkwruclr";
		int index=0;
		String nstr="";
		boolean ans=false;
		
		for(int i=0; i<s.length(); i++) {
			if(goal.charAt(0)==s.charAt(i)) {
				index=i;
				System.out.println(index);
				for(int j=index; j<s.length(); j++) {
					nstr=nstr+s.charAt(j);
				}
				for(int j=0; j<index; j++) {
					nstr=nstr+s.charAt(j);
				}
				if(nstr.equals(goal)) {
					ans=true;
					break;
				}
			
					nstr="";
				
			}	
		}
		
		
		
			System.out.println(ans);
	}

}
