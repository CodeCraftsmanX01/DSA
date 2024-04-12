package Strings;
import java.util.Arrays;
public class DeleteColumnstoMakeSorted {

	public static void main(String[] args) {
		String strs[] = {"rrjk","furt","guzm"};
		int count=0;
		String str="";
	
		if(strs.length>2) {
		for(int i=0; i<strs.length; i++) {
			for(int m=0; m<strs[i].length(); m++) {
				for(int l=0; l<strs.length; l++) {
						str=str+strs[l].charAt(m);
								}
						str=str+" ";
						}
				break;
				}
			String s[]=str.split(" ");
			System.out.println(Arrays.toString(s));
	
		for(int i=0; i<s.length; i++) {
			int p=0;
			int q=1;
			if((int )s[i].charAt(p)>(int)s[i].charAt(q)) {
			count=count+1;	
			break;
	
					}
			p++;
			q++;
		
				}
		}
		
		else {
		count=0;
			}
	System.out.println(count);
	}
	
}


