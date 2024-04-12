package Strings;

public class WordsThatCanBeFormedbyCharacters {

	public static void main(String[] args) {
	//	String [] words = {"cat","bt","hat","tree"};
		String words = "cat";
		String chars = "atach";
		/*char newChars[]=new char[chars.length()];
				for (int i = 0; i < chars.length(); i++) {
		            newChars[i] = chars.charAt(i);
		        }*/
		
		int count=0;
		int charC=0;
		
		
	//	for(int i=0; i<words.length; i++) {
			//loop for picking one word
			for(int j=0; j<words.length(); j++) {
				String newChars=chars;
				//loop to travel in word)
				for(char k=0; k<newChars.length(); k++) {
					//loop to travel in chars)
					if(words.charAt(j)==newChars.charAt(k)) {
						
						count++;
						}
					else {
						count=0;
					}
					
				}
				
				System.out.println(count);
			}
		//}
		
		
		
	}

}
