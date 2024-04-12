package Strings;

public class excelSheetcolumnnumber {

	public static void main(String[] args) {
		int columnNumber = 701;
		String nstr="";
		
		while(columnNumber!=0) {
			char ch=(char)(65+(columnNumber-1)%26);
			System.out.println(ch);
			nstr=ch+nstr;
			columnNumber=(columnNumber-1)/26;
			System.out.println(columnNumber);
		}
		System.out.println(nstr);
	}

}
