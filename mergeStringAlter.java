package Strings;

public class mergeStringAlter {

	public static void main(String[] args) {
		String word1="abc";
		String word2="pqrst";
		StringBuilder str=new StringBuilder();
		for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length())
             str.append(word1.charAt(i));
            if (i < word2.length())
               str.append(word2.charAt(i));
        }
System.out.println(str);
	}

}
