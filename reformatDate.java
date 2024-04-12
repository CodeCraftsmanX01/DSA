package Strings;
import java.util.Arrays;
public class reformatDate {

	public static void main(String[] args) {
		String date = "26th May 1960";
		String arr[]=date.split(" ");
		String month[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		 StringBuilder sb = new StringBuilder();
		
		sb.append(arr[2]);
		sb.append("-");
		
		
		int k=1;
		int m=0;
		while(m<=12) {
		if(arr[k].equals(month[m])) {
			if(m<9) {
				
				sb.append("0"+(m+1));
				sb.append("-");
				break;
			}
			else {
				sb.append((m+1));
				sb.append("-");
				break;
			}
		}
		else {
			m++;
		}
		}
		
		int i=0;
		if(arr[i].length()==4) {
		for(int j=0; j<arr[i].length()-2; j++) {
			sb.append(arr[i].charAt(j));
		}
		}
		else {
			for(int j=0; j<arr[i].length()-2; j++) {
				sb.append("0"+(arr[i].charAt(j)));
			}
			}
		String singleString = sb.toString();
		System.out.println(singleString);
		
		
		
	}

}
