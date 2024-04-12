package Strings;

public class WordsFoundinSentences {

	public static void main(String[] args) {
		String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int count=0;
		int max=0;
		for(int i=0; i<sentences.length; i++) {
			count=sentences[i].split(" ").length;
		
			if(count>max) {
				max=count;
			}
			}
		System.out.println(max);
	}
		}
		
