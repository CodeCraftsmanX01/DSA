package recursion;

import java.util.*;;

public class permutationofString {
	
	//first aproach 
	static void permut(String str, String res) {
		if(str.isEmpty()) {
			System.out.println(res);
			return;
		}
		
		char ch=str.charAt(0);
		for(int i=0; i<=res.length(); i++) {
			String first=res.substring(0,i);
			String second=res.substring(i,res.length());
			
			permut(str.substring(1),first+ch+second);
			
		}
	}
	
	//2nd aproach using arraylist
	static ArrayList<String> permute(String str, String res){
		if(str.isEmpty()) {
			ArrayList<String>list=new ArrayList<>();
			list.add(res);
			return list;
		}
		
		char ch=str.charAt(0);
		ArrayList<String>list=new ArrayList<>();
		
		for(int i=0; i<=res.length(); i++) {
			String first=res.substring(0,i);
			String second=res.substring(i,res.length());
			
			list.addAll(permute(str.substring(1),first+ch+second));
			}
		return list;
		
	}
	
	//total number of combination possible
	static int permutcount(String str, String res) {
		if(str.isEmpty()) {
			return 1;
		}
		int count=0;
		char ch=str.charAt(0);
		for(int i=0; i<=res.length(); i++) {
			String first=res.substring(0,i);
			String second=res.substring(i,res.length());
			
			count=count+ permutcount(str.substring(1),first+ch+second);
			
		}
		return count;
	}
	
	public static void main(String[] args) {
	String str="abc";
	permut(str,"");
	System.out.println();
	System.out.println(permute(str,""));
	System.out.println();
	System.out.println(permutcount(str,""));

	}

}
