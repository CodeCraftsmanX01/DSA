package Arrays;
import java.util.ArrayList;
public class subsequences {

	static ArrayList<String> subseq(String str,String res) {
		ArrayList <String>list = new ArrayList<String>();
		
		if(str.isEmpty()) {
			list.add(res);
			return list;
		}
		
		char ch=str.charAt(0);
		
		ArrayList<String>left =subseq(str.substring(1),res+ch);
		ArrayList<String>right =subseq(str.substring(1),res);
		
		left.addAll(right);
		return left;
		
	}
	
	
	
	public static void main(String[] args) {
		String str="abc";
		char ch[]=str.toCharArray();
		ArrayList <String>list = new ArrayList<String>();

		
		for(int i=0; i<ch.length; i++) {
			String str2="";
			for(int j=i; j<ch.length; j++) {
				for(int k=i; k<=j; k++) {
					str2=str2+ch[k];
				}
				list.add(str2);
				str2="";
			}
		}
		System.out.println(list);
		
		System.out.println(subseq(str,""));
		
	}

	
	
}
