package Hashmap;

import java.util.HashSet;

public class singleoccurence {

	public static void main(String[] args) {
		String S = "heellooooo";
		 HashSet<Character>set = new HashSet<>();
	      for(int i=0; i<S.length();i++){
	          set.add(S.charAt(i));
	      }
	      System.out.println(set);
	}

}
