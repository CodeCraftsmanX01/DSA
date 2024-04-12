package Strings;

import java.util.Arrays;
public class sortestDistanceToCharacter {

	public static void main(String[] args) {
		String s = "loveleetcode";
		char ch[]=s.toCharArray();
		char c='e';
		int arr[]=new int[ch.length];
		int j=0;
		int i=j;
		
		while(j<ch.length) {
			if(ch[j]==c) {
				while(i<=j) {
				arr[i]=Math.abs(i-j);
				i++;
				}

				
			}
				j++;
			}
		
		System.out.println(Arrays.toString(arr));
	}

}
