package Hashmap;
import java.util.*;
public class countmaxduplicates {

	public static void main(String[] args) {
		String str="abccaaddaaaes";
		
		//method 1
		
		int arr[]=new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			arr[ch-'a']++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]); 
		
		
		
		//method 2
		
		
		int ans=0;
		char ch=' ';
		for(int i=0; i<str.length(); i++) {
			int count=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(ans<count) {
				ans=count;
				ch=str.charAt(i);
			}
		}
		
		System.out.println("Count is "+ans+" and character is "+"'"+ch+"'.");
		
		
		//method 3
		
		
	}
}
