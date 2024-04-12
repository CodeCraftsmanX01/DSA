package stackandqueue;

public class nextgreaterelemntIII {

	public static void main(String[] args) {
		int n=631542;
		String s=Integer.toString(n);
		char ch[]=s.toCharArray();
		
		//find the first dip
		int i=ch.length-2;
		while(i>=0 && ch[i]>=ch[i+1]) {
			i--;
		}
		if(i==-1) {
			System.out.println("-1");
		}
		
		//find just greater than i th index element
		int k=ch.length-1;
		while(ch[i]>ch[k]) {
			k--;
		}
		
		//swap i from k
		char temp=ch[i];
		ch[i]=ch[k];
		ch[k]=temp;
		
		//contatinate from o to i index
		
		String str="";
		for(int j=0; j<=i; j++) {
			str=str+ch[j];
		}
		
		//concatenate from k to i+1
		for(int j=ch.length-1; j>i; j--) {
			str=str+ch[j];
		}
		
		int op=Integer.parseInt(str);
		System.out.println(op);
	}

}
