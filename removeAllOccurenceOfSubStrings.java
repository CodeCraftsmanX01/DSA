package Strings;

public class removeAllOccurenceOfSubStrings {

	public static void main(String[] args) {
		String  s = "daabcbaabcbc", part = "abc";
		StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            sb.append(s.charAt(i));
            int start = sb.length()-part.length();
            if(sb.length() >= part.length() && sb.substring(start).equals(part)){
                int end = sb.length();
               sb.delete(start,end);
            }
        }
        System.out.println(sb.toString());
	}

}
